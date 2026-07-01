plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "MangaLivre"
    versionCode = 1
    contentWarning = ContentWarning.SAFE
    libVersion = "1.4"

    source {
        lang = "pt-BR"
        baseUrl = "https://mangalivre.blog"
    }
}
