#include <stdlib.h>
#include <gtk/gtk.h>
#include <pango.h>
#include <pango-font.h>

static void helloWorld (GtkWidget *wid, GtkWidget *win)
{
  GtkWidget *dialog = NULL;

  dialog = gtk_message_dialog_new (GTK_WINDOW (win), GTK_DIALOG_MODAL, GTK_MESSAGE_INFO, GTK_BUTTONS_CLOSE, "Hello World!");
  gtk_window_set_position (GTK_WINDOW (dialog), GTK_WIN_POS_CENTER);
  gtk_dialog_run (GTK_DIALOG (dialog));
  gtk_widget_destroy (dialog);
}

int main (int argc, char *argv[])
{
    GtkWidget *button = NULL;
    GtkWidget *win = NULL;
    GtkWidget *vbox = NULL;
    GtkWidget *table = NULL;
    GtkWidget *text_entry_Widget;
    GtkWidget *textLabel_Widget;
    GtkTooltips *tooltipsA;

    GdkColor colorBlack;
    GdkColor colorGreen;

    // black
    colorBlack.red=0;
    colorBlack.green=0;
    colorBlack.blue=0;

    // Green
    colorGreen.red=0;
    colorGreen.green=65535;
    colorGreen.blue=0;

    char textLabel[64];
    char *temp;
    gsize inbytes;
    gsize outbytes;
    temp = "Εισάγετε το κεφάλαιο για το οποίο θέλετε να υπολογίσετε τους τόκους (σε ευρώ)";
    char *toolTipsText0 = g_locale_to_utf8(temp, strlen(temp), &inbytes, &outbytes, NULL);
    temp = "Κεφάλαιο προς επένδυση";
    char *textLabel0= g_locale_to_utf8(temp, strlen(temp), &inbytes, &outbytes, NULL);
    temp = "Αριθμός μηνών προγράμματος";
    char *txtBuffer = g_locale_to_utf8(temp, strlen(temp), &inbytes, &outbytes, NULL);

    temp = "Επιτόκια ανά μήνα";
    char *txtLabel2 = g_locale_to_utf8(temp, strlen(temp), &inbytes, &outbytes, NULL);
    temp = "Ποσοστό φόρου";
    char *txtLabel3 = g_locale_to_utf8(temp, strlen(temp), &inbytes, &outbytes, NULL);


      /* Initialize GTK+ */
    g_log_set_handler ("Gtk", G_LOG_LEVEL_WARNING, (GLogFunc) gtk_false, NULL);
    gtk_init (&argc, &argv);
    g_log_set_handler ("Gtk", G_LOG_LEVEL_WARNING, g_log_default_handler, NULL);

    /* Create the main window */
    win = gtk_window_new (GTK_WINDOW_TOPLEVEL);
    gtk_container_set_border_width (GTK_CONTAINER (win), 8);
    gtk_window_set_title (GTK_WINDOW (win), "Bank Account Profit Program ");
    gtk_window_set_position (GTK_WINDOW (win), GTK_WIN_POS_CENTER);
    gtk_widget_realize (win);
    g_signal_connect (win, "destroy", gtk_main_quit, NULL);

    /* Create a vertical box with buttons */
    vbox = gtk_vbox_new (TRUE, 6);
    gtk_container_add (GTK_CONTAINER (win), vbox);

    button = gtk_button_new_from_stock (GTK_STOCK_DIALOG_INFO);
    g_signal_connect (G_OBJECT (button), "clicked", G_CALLBACK (helloWorld), (gpointer) win);
    gtk_box_pack_start (GTK_BOX (vbox), button, TRUE, TRUE, 0);

    button = gtk_button_new_from_stock (GTK_STOCK_CLOSE);
    g_signal_connect (button, "clicked", gtk_main_quit, NULL);
    gtk_box_pack_start (GTK_BOX (vbox), button, TRUE, TRUE, 0);

    //sprintf(textLabel, "<small>%s</small>",textLabel0);

    textLabel_Widget = gtk_label_new (textLabel);
    gtk_label_set_markup(GTK_LABEL (textLabel_Widget),textLabel);
    gtk_label_set_justify(GTK_LABEL (textLabel_Widget),GTK_JUSTIFY_LEFT);
    gtk_misc_set_alignment (GTK_MISC (textLabel_Widget), 0, 0.5);
    gtk_widget_show (textLabel_Widget);



  /* create a new label. */
  //label = gtk_label_new ("Enter some text:" );
  //gtk_misc_set_alignment (GTK_MISC (label), 0, 0);

    // --------------------------------------------------------------------
    // Create text entry widget and modify.
    // --------------------------------------------------------------------

    text_entry_Widget = gtk_entry_new();
    //gtk_entry_set_max_length (GTK_ENTRY (text_entry_Widget),0);
    //gtk_table_attach_defaults (GTK_TABLE (table), text_entry_Widget, 0, 1, 0, 1);

    gtk_widget_modify_text(text_entry_Widget, GTK_STATE_NORMAL, &colorGreen);
    gtk_widget_modify_base(text_entry_Widget, GTK_STATE_NORMAL, &colorBlack);

    GtkStyle *style = gtk_widget_get_style(text_entry_Widget);
    pango_font_description_set_weight(style->font_desc, PANGO_WEIGHT_BOLD);
    gtk_widget_modify_font(text_entry_Widget, style->font_desc);

    int   text_width = 80;           // Width of field in characters
    gtk_entry_set_width_chars(GTK_ENTRY(text_entry_Widget), text_width);

    gtk_editable_set_editable(GTK_EDITABLE(text_entry_Widget), TRUE);
    GTK_WIDGET_UNSET_FLAGS(text_entry_Widget, GTK_CAN_FOCUS);

    gtk_entry_set_text(GTK_ENTRY(text_entry_Widget), txtBuffer);
    tooltipsA = gtk_tooltips_new();
    gtk_tooltips_set_tip(tooltipsA, text_entry_Widget, toolTipsText0, NULL);
    gtk_box_pack_start (GTK_BOX (vbox), text_entry_Widget, TRUE, TRUE, 0);
    gtk_widget_show (text_entry_Widget);


    /* Enter the main loop */
    gtk_widget_show_all (win);
    gtk_main ();
    return 0;
}
