plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Pluma Comics"
    versionCode = 1
    contentWarning = ContentWarning.SAFE
    libVersion = "1.4"

    source {
        lang = "pt-BR"
        baseUrl = "https://plumacomics.cloud"
    }
}
