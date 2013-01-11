
#include <stdio.h>
#include <math.h>
#include <time.h>
#include <assert.h>

#define KEFALAIO 20000 //se euro
#define NUM_OF_MONTHS  15

struct year_data
{
    int DAYS_PER_MONTH[12];
    int DAYS_PER_YEAR;
};

struct time_data
{
    int month;
    int year;
};

typedef struct year_data year_data_t;
typedef struct time_data time_data_t;

static float sum_array(float a[], int num_elements);
static void print_array(float a[], int num_elements, float sum, float loss);
static void log_data();
static void FormatYearData(year_data_t *out, int year);
static void findtime(time_data_t *out);
static void compute_profit(int num_of_months, int kefalaio, float *interest_rates, float month_gains[]);
static float taxes(float percent, float gains);

static float interest_rates[NUM_OF_MONTHS] = {
        4, 4.10, 4.20, 4.30, 4.40, 4.50, 4.70, 4.90, 5.10, 5.20, 5.40, 6.00, 6.50, 7.00, 7.50
    };
static float TAXES_PERCENT = 0.1;

int main(int argc, char* argv[])
{
    float sum, loss, monthly_gains[NUM_OF_MONTHS];
    compute_profit(NUM_OF_MONTHS, KEFALAIO, interest_rates, monthly_gains);

    sum = sum_array(monthly_gains, NUM_OF_MONTHS);
    loss =  taxes(TAXES_PERCENT, sum);
#ifdef DEBUG
    print_array(monthly_gains, NUM_OF_MONTHS, sum, loss);
#endif
    log_data(monthly_gains, 15);
    return 0;
}

static void compute_profit(int num_of_months, int kefalaio, float *interest_rates, float monthly_gains[])
{
    int i,j;
    year_data_t yeardata;
    int m[num_of_months];  //array of the number of days of the months where the contract is to be evaluated
    time_data_t out;

    findtime(&out);

    FormatYearData(&yeardata, out.year);

    for (i = 0, j=1; i < num_of_months; i ++)
    {
        if ((out.month + i - 1)%12 == 0 && i )
        {   //a new year starts
            FormatYearData(&yeardata, out.year + j);
            m[i] = yeardata.DAYS_PER_MONTH[(out.month + i - 1)%12];
            monthly_gains[i] = interest_rates[i] * m[i] * KEFALAIO / 100 / yeardata.DAYS_PER_YEAR ;
            j++;
            continue;
        }

        m[i] = yeardata.DAYS_PER_MONTH[(out.month + i - 1)%12];
        monthly_gains[i] = interest_rates[i] * m[i] * KEFALAIO / 100 / yeardata.DAYS_PER_YEAR ;

    }

}

static float taxes(float percent, float gains)
{
    assert(percent <= 1);
    return  (float)percent*gains;
}


static void FormatYearData(year_data_t *out, int year)
{
    year_data_t current_year_data;
    current_year_data.DAYS_PER_YEAR = 365;

    current_year_data.DAYS_PER_MONTH[0] = 31;
    current_year_data.DAYS_PER_MONTH[1] = 28;
    current_year_data.DAYS_PER_MONTH[2] = 31;
    current_year_data.DAYS_PER_MONTH[3] = 30;
    current_year_data.DAYS_PER_MONTH[4] = 31;
    current_year_data.DAYS_PER_MONTH[5] = 30;
    current_year_data.DAYS_PER_MONTH[6] = 31;
    current_year_data.DAYS_PER_MONTH[7] = 31;
    current_year_data.DAYS_PER_MONTH[8] = 30;
    current_year_data.DAYS_PER_MONTH[9] = 31;
    current_year_data.DAYS_PER_MONTH[10] = 30;
    current_year_data.DAYS_PER_MONTH[11] = 31;

    if (((year%4==0)&&(year%100!=0))||(year%400==0))
    {
         current_year_data.DAYS_PER_MONTH[1] = 29;
         current_year_data.DAYS_PER_YEAR = 366;
    }
    *out = current_year_data;
}

static void findtime(time_data_t *out)
{
    time_t  currtime;
    char month[12] = {0};
    char year[12] = {0};

    time(&currtime);
    strftime(month,12,"%m",localtime(&currtime));
    strftime(year,12,"%Y",localtime(&currtime));

    out->month = atoi(month);
    out->year = atoi(year);
}

static float sum_array(float a[], int num_elements)
{
   int i;
   float sum=0.0;
   for (i=0; i<num_elements; i++)
   {
	 sum = sum + a[i];
   }
   return(sum);
}

static void print_array(float a[], int num_elements, float sum, float loss)
{
   int i;
   printf("\n");

   for(i = 0; i < num_elements; i++)
   {
	 printf("month: %d\t\tgain: %f\n", i+1, a[i]);
   }
   printf("Synolo tokwn: %f\n", sum_array(a, num_elements));
   printf("Synolo forwn:  %f\n", loss);
   printf("Teliko kerdos: %f\n", sum-loss);

}

static void log_data()
{
   int i;
   FILE *fp;
   float sum,loss, month_gains[NUM_OF_MONTHS];
   compute_profit(NUM_OF_MONTHS, KEFALAIO, interest_rates, month_gains);

   fp =  fopen("wages.log", "wb");
   for(i = 0; i < NUM_OF_MONTHS; i++)
   {
	 fprintf(fp, "month: %d\t\tgain:%f\n", i+1, month_gains[i]);
   }
   sum = sum_array(month_gains, NUM_OF_MONTHS);
   loss =  taxes(TAXES_PERCENT, sum);

   fprintf(fp, "Synolo tokwn: %f\n", sum_array(month_gains, NUM_OF_MONTHS));
   fprintf(fp, "Synolo forwn:  %f\n", loss);
   fprintf(fp, "Teliko kerdos: %f\n", sum-loss);

   fclose(fp);
}
