# Cose da fare ed errori conosciuti #

## Fatti ##

  1. ~~Errore relativo alla fase lunare: sembra persistere un errore sulla fase lunare. Controllando c'e' un giorno di differenza sulla fase lunare. SOLUZIONE POSSIBILE: utilizzare una diversa libreria o funzione per il calcolo della fase lunare ed armonizzarla con il codice già esistente (http://www.koders.com/java/fid26AB2334535059B2BB3FE77CC0591FD2AD9DA0B6.aspx?s=moon+phase#L1)~~
  1.~~La data del calendario Islamica sembra soffrire dello stesso errore.~~*~~Chiedere allo sviluppatore possibili soluzioni (http://code.google.com/p/hijricalendar/)~~
    * ~~Vedere codice per una versione Android dell'hijricalendar (http://code.google.com/p/hicriandcalendar/)~~
    * Usare un'altra libreria di funzioni? (http://code.google.com/p/j-islamic/)
    *~~(Controllato con; https://market.android.com/details?id=com.cepmuvakkit e sembra tutto ok!)~~1.~~Aggiungere calendario Maya~~vedi: https://jade.dev.java.net/
  1.~~Aggiungere festività mobili (Pasqua, Pentecoste. etc...)~~1. Integrare il servizio online per le festività civili nel mondo? (http://api.daybase.eu/)
  1. Creare un Intent in modo da permettere ad altre applicazioni di ricevere i dati elaborati da Almanac
  1.~~Integrare l'ottima AboutActivity: http://android.marcoduff.com/aboutactivity.php~~
  1. ~~Popolare la tabella dei santi del giorno (chiedendo autorizzazione ;-) con: (http://saints.sqpn.com/calendar-of-saints/)~~~~


---


## Ancora da fare ##

  1. Aggiungere numero del giorno (x/365) come da richiesta utente (molto semplice ma da integrare ovunque)
  1. Aggiungere Proverbio del giorno (Ci stiamo lavorando), fare attenzione ad un corretto aggiornamento del db interno
  1. Integrare un widget nell'applicazione (richiesta di numerosi utenti)