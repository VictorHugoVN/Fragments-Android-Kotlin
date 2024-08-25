package com.example.trabalho_fragments.model

data class Email (
    val user: String,
    val subject: String,
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    fun build(): Email = Email(user, subject)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build() //Construir os emailBuilder

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "YouTube"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    },
    email {
        user = "Facebook"
        subject = "Veja nossas três dicas principais"
    }
)