package eu.kanade.tachiyomi.extension.pt.mangalivre

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.HttpSource
import keiyoushi.annotation.Source
import okhttp3.Request
import okhttp3.Response

/**
 * Esqueleto gerado pelo Mihon Source Studio.
 *
 * Este site não foi reconhecido como Madara. Este módulo SÓ COMPILA;
 * ele não funciona de verdade até os TODO() abaixo serem substituídos
 * pelos requests/parsers reais do site (o keiyoushi exige que todo
 * método abstrato de HttpSource seja implementado, mesmo em rascunho).
 */
@Source
abstract class MangaLivre : HttpSource() {
    override val supportsLatest = true

    override fun popularMangaRequest(page: Int): Request = TODO("Implementar popularMangaRequest")
    override fun popularMangaParse(response: Response): MangasPage = TODO("Implementar popularMangaParse")

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request = TODO("Implementar searchMangaRequest")
    override fun searchMangaParse(response: Response): MangasPage = TODO("Implementar searchMangaParse")

    override fun latestUpdatesRequest(page: Int): Request = TODO("Implementar latestUpdatesRequest")
    override fun latestUpdatesParse(response: Response): MangasPage = TODO("Implementar latestUpdatesParse")

    override fun mangaDetailsParse(response: Response): SManga = TODO("Implementar mangaDetailsParse")

    override fun chapterListParse(response: Response): List<SChapter> = TODO("Implementar chapterListParse")

    override fun pageListParse(response: Response): List<Page> = TODO("Implementar pageListParse")

    override fun imageUrlParse(response: Response): String = TODO("Implementar imageUrlParse")
}
