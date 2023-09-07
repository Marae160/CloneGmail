package com.example.clonegmail

import android.util.Log
 //will return an initial list of 10 emails
class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        // opens up the function
        fun getEmails(): MutableList<Email> {
            // creating a list to store emails
            val emails : MutableList<Email> = ArrayList()
            // can hold up to 10 or less in the view on the interface
            for (i in 0..9) {
                //Just adds different emails
                val email = Email(senders[i], title, summary)
                // adding each individual emails to the list 
                emails.add(email)
            }
            return emails
        }
// will return the next 5 emails if you re interested in implementing the stretch feature to let the user load more emails.
        fun getNext5Emails(): MutableList<Email> {
            val newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title, summary)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}



