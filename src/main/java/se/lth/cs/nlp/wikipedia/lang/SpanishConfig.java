package se.lth.cs.nlp.wikipedia.lang;

/**
 * Created by marcus on 2015-03-23.
 */
public class SpanishConfig extends TemplateConfig {

    public SpanishConfig() {
        addNamespaceAlias(-2, "Medio");
        addNamespaceAlias(-1, "Especial");
        addNamespaceAlias(1, "Discusión");
        addNamespaceAlias(2, "Usuario", "Usuario", "Usuaria");
        addNamespaceAlias(3, "Usuario_discusión", "Usuario_Discusión", "Usuaria_Discusión");
        addNamespaceAlias(4, "Wikipedia");
        addNamespaceAlias(5, "Wikipedia_discusión");
        addNamespaceAlias(6, "Archivo", "Imagen");
        addNamespaceAlias(7, "Archivo_discusión", "Imagen_Discusión");
        addNamespaceAlias(8, "MediaWiki");
        addNamespaceAlias(9, "MediaWiki_discusión");
        addNamespaceAlias(10, "Plantilla");
        addNamespaceAlias(11, "Plantilla_discusión");
        addNamespaceAlias(12, "Ayuda");
        addNamespaceAlias(13, "Ayuda_discusión");
        addNamespaceAlias(14, "Categoría");
        addNamespaceAlias(15, "Categoría_discusión");

        addI18nCIAlias("redirect", "#REDIRECCIÓN", "#REDIRECCION", "#REDIRECT");
        addI18nCIAlias("notoc", "__SIN_TDC__", "__NOTDC__", "__NOTOC__");
        addI18nCIAlias("nogallery", "__SIN_GALERÍA__", "__NOGALERÍA__", "__NOGALERIA__", "__NOGALLERY__");
        addI18nCIAlias("forcetoc", "__FORZAR_TDC__", "__FORZARTDC__", "__FORZARTOC__", "__FORCETOC__");
        addI18nCIAlias("toc", "__TDC__", "__TOC__");
        addI18nCIAlias("noeditsection", "__NO_EDITAR_SECCIÓN__", "__NOEDITARSECCIÓN__", "__NOEDITARSECCION__", "__NOEDITSECTION__");
        addI18nAlias("currentmonth", "MESACTUAL", "MESACTUAL2", "CURRENTMONTH", "CURRENTMONTH2");
        addI18nAlias("currentmonth1", "MESACTUAL1", "CURRENTMONTH1");
        addI18nAlias("currentmonthname", "MESACTUALCOMPLETO", "NOMBREMESACTUAL", "CURRENTMONTHNAME");
        addI18nAlias("currentmonthnamegen", "MESACTUALGENITIVO", "CURRENTMONTHNAMEGEN");
        addI18nAlias("currentmonthabbrev", "MESACTUALABREVIADO", "CURRENTMONTHABBREV");
        addI18nAlias("currentday", "DÍAACTUAL", "DIAACTUAL", "DÍA_ACTUAL", "DIA_ACTUAL", "CURRENTDAY");
        addI18nAlias("currentday2", "DÍAACTUAL2", "DIAACTUAL2", "DÍA_ACTUAL2", "DIA_ACTUAL2", "CURRENTDAY2");
        addI18nAlias("currentdayname", "NOMBREDÍAACTUAL", "NOMBREDIAACTUAL", "CURRENTDAYNAME");
        addI18nAlias("currentyear", "AÑOACTUAL", "AÑO_ACTUAL", "CURRENTYEAR");
        addI18nAlias("currenttime", "HORA_MINUTOS_ACTUAL", "HORAMINUTOSACTUAL", "TIEMPOACTUAL", "CURRENTTIME");
        addI18nAlias("currenthour", "HORAACTUAL", "HORA_ACTUAL", "CURRENTHOUR");
        addI18nAlias("localmonth", "MESLOCAL", "MESLOCAL2", "LOCALMONTH", "LOCALMONTH2");
        addI18nAlias("localmonth1", "MESLOCAL1", "LOCALMONTH1");
        addI18nAlias("localmonthname", "MESLOCALCOMPLETO", "NOMBREMESLOCAL", "LOCALMONTHNAME");
        addI18nAlias("localmonthnamegen", "MESLOCALGENITIVO", "LOCALMONTHNAMEGEN");
        addI18nAlias("localmonthabbrev", "MESLOCALABREVIADO", "LOCALMONTHABBREV");
        addI18nAlias("localday", "DÍALOCAL", "DIALOCAL", "LOCALDAY");
        addI18nAlias("localday2", "DIALOCAL2", "DÍALOCAL2", "LOCALDAY2");
        addI18nAlias("localdayname", "NOMBREDIALOCAL", "NOMBREDÍALOCAL", "LOCALDAYNAME");
        addI18nAlias("localyear", "AÑOLOCAL", "LOCALYEAR");
        addI18nAlias("localtime", "HORAMINUTOSLOCAL", "TIEMPOLOCAL", "LOCALTIME");
        addI18nAlias("localhour", "HORALOCAL", "LOCALHOUR");
        addI18nAlias("numberofpages", "NÚMERODEPÁGINAS", "NUMERODEPAGINAS", "NUMBEROFPAGES");
        addI18nAlias("numberofarticles", "NÚMERODEARTÍCULOS", "NUMERODEARTICULOS", "NUMBEROFARTICLES");
        addI18nAlias("numberoffiles", "NÚMERODEARCHIVOS", "NUMERODEARCHIVOS", "NUMBEROFFILES");
        addI18nAlias("numberofusers", "NÚMERODEUSUARIOS", "NUMERODEUSUARIOS", "NUMBEROFUSERS");
        addI18nAlias("numberofactiveusers", "NÚMERODEUSUARIOSACTIVOS", "NUMERODEUSUARIOSACTIVOS", "NUMBEROFACTIVEUSERS");
        addI18nAlias("numberofedits", "NÚMERODEEDICIONES", "NUMERODEEDICIONES", "NUMBEROFEDITS");
        addI18nAlias("numberofviews", "NÚMERODEVISTAS", "NUMERODEVISTAS", "NUMBEROFVIEWS");
        addI18nAlias("pagename", "NOMBREDEPAGINA", "NOMBREDEPÁGINA", "PAGENAME");
        addI18nAlias("pagenamee", "NOMBREDEPAGINAC", "NOMBREDEPÁGINAC", "PAGENAMEE");
        addI18nAlias("namespace", "ESPACIODENOMBRE", "NAMESPACE");
        addI18nAlias("namespacee", "ESPACIODENOMBREC", "NAMESPACEE");
        addI18nAlias("namespacenumber", "NÚMERODELESPACIO", "NAMESPACENUMBER");
        addI18nAlias("talkspace", "ESPACIODEDISCUSION", "ESPACIODEDISCUSIÓN", "TALKSPACE");
        addI18nAlias("talkspacee", "ESPACIODEDISCUSIONC", "TALKSPACEE");
        addI18nAlias("subjectspace", "ESPACIODEASUNTO", "ESPACIODETEMA", "ESPACIODEARTÍCULO", "ESPACIODEARTICULO", "SUBJECTSPACE", "ARTICLESPACE");
        addI18nAlias("subjectspacee", "ESPACIODETEMAC", "ESPACIODEASUNTOC", "ESPACIODEARTICULOC", "ESPACIODEARTÍCULOC", "SUBJECTSPACEE", "ARTICLESPACEE");
        addI18nAlias("fullpagename", "NOMBRECOMPLETODEPÁGINA", "NOMBRECOMPLETODEPAGINA", "FULLPAGENAME");
        addI18nAlias("fullpagenamee", "NOMBRECOMPLETODEPAGINAC", "NOMBRECOMPLETODEPÁGINAC", "FULLPAGENAMEE");
        addI18nAlias("subpagename", "NOMBREDESUBPAGINA", "NOMBREDESUBPÁGINA", "SUBPAGENAME");
        addI18nAlias("subpagenamee", "NOMBREDESUBPAGINAC", "NOMBREDESUBPÁGINAC", "SUBPAGENAMEE");
        addI18nAlias("rootpagename", "NOMBREDEPAGINARAIZ", "NOMBREDEPÁGINARAÍZ", "ROOTPAGENAME");
        addI18nAlias("rootpagenamee", "NOMBREDEPAGINARAIZC", "NOMBREDEPÁGINARAÍZC", "ROOTPAGENAMEE");
        addI18nAlias("basepagename", "NOMBREDEPAGINABASE", "NOMBREDEPÁGINABASE", "BASEPAGENAME");
        addI18nAlias("basepagenamee", "NOMBREDEPAGINABASEC", "NOMBREDEPÁGINABASEC", "BASEPAGENAMEE");
        addI18nAlias("talkpagename", "NOMBREDEPÁGINADEDISCUSIÓN", "NOMBREDEPAGINADEDISCUSION", "NOMBREDEPAGINADISCUSION", "NOMBREDEPÁGINADISCUSIÓN", "TALKPAGENAME");
        addI18nAlias("talkpagenamee", "NOMBREDEPÁGINADEDISCUSIÓNC", "NOMBREDEPAGINADEDISCUSIONC", "NOMBREDEPAGINADISCUSIONC", "NOMBREDEPÁGINADISCUSIÓNC", "TALKPAGENAMEE");
        addI18nAlias("subjectpagename", "NOMBREDEPAGINADETEMA", "NOMBREDEPÁGINADETEMA", "NOMBREDEPÁGINADEASUNTO", "NOMBREDEPAGINADEASUNTO", "NOMBREDEPAGINADEARTICULO", "NOMBREDEPÁGINADEARTÍCULO", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
        addI18nAlias("subjectpagenamee", "NOMBREDEPAGINADETEMAC", "NOMBREDEPÁGINADETEMAC", "NOMBREDEPÁGINADEASUNTOC", "NOMBREDEPAGINADEASUNTOC", "NOMBREDEPAGINADEARTICULOC", "NOMBREDEPÁGINADEARTÍCULOC", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
        addI18nCIAlias("msg", "MSJ:", "MSG:");
        addI18nCIAlias("subst", "SUST:", "FIJAR:", "SUBST:");
        addI18nAlias("img_thumbnail", "miniaturadeimagen", "miniatura", "mini", "thumbnail", "thumb");
        addI18nAlias("img_manualthumb", "miniaturadeimagen=$1", "miniatura=$1", "thumbnail=$1", "thumb=$1");
        addI18nAlias("img_right", "derecha", "dcha", "der", "right");
        addI18nAlias("img_left", "izquierda", "izda", "izq", "left");
        addI18nAlias("img_none", "ninguna", "nada", "no", "ninguno", "none");
        addI18nAlias("img_center", "centro", "centrado", "centrada", "centrar", "center", "centre");
        addI18nAlias("img_framed", "marco", "enmarcado", "enmarcada", "framed", "enframed", "frame");
        addI18nAlias("img_frameless", "sinmarco", "sin_enmarcar", "sinenmarcar", "frameless");
        addI18nAlias("img_page", "pagina=$1", "página=$1", "pagina_$1", "página_$1", "page=$1", "page $1");
        addI18nAlias("img_border", "borde", "border");
        addI18nAlias("img_link", "vínculo=$1", "vinculo=$1", "enlace=$1", "link=$1");
        addI18nAlias("sitename", "NOMBREDELSITIO", "SITENAME");
        addI18nCIAlias("ns", "EN:", "NS:");
        addI18nCIAlias("localurl", "URLLOCAL:", "LOCALURL:");
        addI18nCIAlias("localurle", "URLLOCALC:", "LOCALURLE:");
        addI18nCIAlias("server", "SERVIDOR", "SERVER");
        addI18nCIAlias("servername", "NOMBRESERVIDOR", "SERVERNAME");
        addI18nCIAlias("scriptpath", "RUTASCRIPT", "RUTADESCRIPT", "SCRIPTPATH");
        addI18nCIAlias("stylepath", "RUTAESTILO", "RUTADEESTILO", "STYLEPATH");
        addI18nCIAlias("grammar", "GRAMATICA:", "GRAMÁTICA:", "GRAMMAR:");
        addI18nCIAlias("gender", "GÉNERO:", "GENERO:", "GENDER:");
        addI18nCIAlias("notitleconvert", "__NOCONVERTIRTITULO__", "__NOCONVERTIRTÍTULO__", "__NOCT___", "__NOTITLECONVERT__", "__NOTC__");
        addI18nCIAlias("nocontentconvert", "__NOCONVERTIRCONTENIDO__", "__NOCC___", "__NOCONTENTCONVERT__", "__NOCC__");
        addI18nAlias("currentweek", "SEMANAACTUAL", "CURRENTWEEK");
        addI18nAlias("currentdow", "DDSACTUAL", "DIADESEMANAACTUAL", "DÍADESEMANAACTUAL", "CURRENTDOW");
        addI18nAlias("localweek", "SEMANALOCAL", "LOCALWEEK");
        addI18nAlias("localdow", "DDSLOCAL", "DIADESEMANALOCAL", "DÍADESEMANALOCAL", "LOCALDOW");
        addI18nAlias("revisionid", "IDDEREVISION", "IDREVISION", "IDDEREVISIÓN", "IDREVISIÓN", "REVISIONID");
        addI18nAlias("revisionday", "DIADEREVISION", "DIAREVISION", "DÍADEREVISIÓN", "DÍAREVISIÓN", "REVISIONDAY");
        addI18nAlias("revisionday2", "DIADEREVISION2", "DIAREVISION2", "DÍADEREVISIÓN2", "DÍAREVISIÓN2", "REVISIONDAY2");
        addI18nAlias("revisionmonth", "MESDEREVISION", "MESDEREVISIÓN", "MESREVISION", "MESREVISIÓN", "REVISIONMONTH");
        addI18nAlias("revisionyear", "AÑODEREVISION", "AÑODEREVISIÓN", "AÑOREVISION", "AÑOREVISIÓN", "REVISIONYEAR");
        addI18nAlias("revisiontimestamp", "MARCADEHORADEREVISION", "MARCADEHORADEREVISIÓN", "REVISIONTIMESTAMP");
        addI18nAlias("revisionuser", "USUARIODEREVISION", "USUARIODEREVISIÓN", "REVISIONUSER");
        addI18nCIAlias("fullurl", "URLCOMPLETA:", "FULLURL:");
        addI18nCIAlias("fullurle", "URLCOMPLETAC:", "FULLURLE:");
        addI18nCIAlias("canonicalurl", "URLCANONICA:", "CANONICALURL:");
        addI18nCIAlias("canonicalurle", "URLCANONICAC:", "CANONICALURLE:");
        addI18nCIAlias("lcfirst", "PRIMEROMINUS:", "PRIMEROMINÚS:", "LCFIRST:");
        addI18nCIAlias("ucfirst", "PRIMEROMAYUS:", "PRIMEROMAYÚS:", "UCFIRST:");
        addI18nCIAlias("lc", "MINUS:", "MINÚS:", "LC:");
        addI18nCIAlias("uc", "MAYUS:", "MAYÚS:", "UC:");
        addI18nCIAlias("raw", "SINFORMATO:", "SINPUNTOS:", "RAW:");
        addI18nAlias("displaytitle", "MOSTRARTÍTULO", "MOSTRARTITULO", "DISPLAYTITLE");
        addI18nAlias("rawsuffix", "SF", "R");
        addI18nAlias("newsectionlink", "__VINCULARANUEVASECCION__", "__ENLACECREARSECCIÓN__", "__NEWSECTIONLINK__");
        addI18nAlias("nonewsectionlink", "__NOVINCULARANUEVASECCION__", "__SINENLACECREARSECCIÓN__", "__NONEWSECTIONLINK__");
        addI18nAlias("currentversion", "VERSIONACTUAL", "VERSIÓNACTUAL", "CURRENTVERSION");
        addI18nCIAlias("urlencode", "CODIFICARURL:", "URLENCODE:");
        addI18nAlias("currenttimestamp", "MARCADEHORAACTUAL", "CURRENTTIMESTAMP");
        addI18nAlias("localtimestamp", "MARCADEHORALOCAL", "LOCALTIMESTAMP");
        addI18nCIAlias("language", "#IDIOMA:", "#LANGUAGE:");
        addI18nAlias("contentlanguage", "IDIOMADELCONTENIDO", "IDIOMADELCONT", "CONTENTLANGUAGE", "CONTENTLANG");
        addI18nAlias("pagesinnamespace", "PÁGINASENESPACIO", "PAGESINNAMESPACE:", "PAGESINNS:");
        addI18nAlias("numberofadmins", "NÚMEROADMINIISTRADORES", "NÚMEROADMINS", "NUMEROADMINS", "NUMEROADMINISTRADORES", "NUMERODEADMINISTRADORES", "NUMERODEADMINS", "NÚMERODEADMINISTRADORES", "NÚMERODEADMINS", "NUMBEROFADMINS");
        addI18nCIAlias("formatnum", "FORMATONÚMERO", "FORMATONUMERO", "FORMATNUM");
        addI18nCIAlias("special", "especial", "special");
        addI18nAlias("defaultsort", "ORDENAR:", "CLAVEDEORDENPREDETERMINADO:", "ORDENDECATEGORIAPREDETERMINADO:", "ORDENDECATEGORÍAPREDETERMINADO:", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
        addI18nCIAlias("filepath", "RUTAARCHIVO:", "RUTARCHIVO:", "RUTADEARCHIVO:", "FILEPATH:");
        addI18nCIAlias("tag", "etiqueta", "tag");
        addI18nAlias("hiddencat", "__CATEGORÍAOCULTA__", "__HIDDENCAT__");
        addI18nAlias("pagesincategory", "PÁGINASENCATEGORÍA", "PÁGINASENCAT", "PAGSENCAT", "PAGINASENCATEGORIA", "PAGINASENCAT", "PAGESINCATEGORY", "PAGESINCAT");
        addI18nAlias("pagesize", "TAMAÑOPÁGINA", "TAMAÑODEPÁGINA", "TAMAÑOPAGINA", "TAMAÑODEPAGINA", "PAGESIZE");
        addI18nAlias("index", "__INDEXAR__", "__INDEX__");
        addI18nAlias("noindex", "__NOINDEXAR__", "__NOINDEX__");
        addI18nAlias("numberingroup", "NÚMEROENGRUPO", "NUMEROENGRUPO", "NUMENGRUPO", "NÚMENGRUPO", "NUMBERINGROUP", "NUMINGROUP");
        addI18nAlias("staticredirect", "__REDIRECCIONESTATICA__", "__REDIRECCIÓNESTÁTICA__", "__STATICREDIRECT__");
        addI18nAlias("protectionlevel", "NIVELDEPROTECCIÓN", "PROTECTIONLEVEL");
        addI18nCIAlias("formatdate", "formatodefecha", "formatearfecha", "formatdate", "dateformat");
    }

    @Override
    protected String getSiteName() {
        return "Wikipedia";
    }

    @Override
    protected String getWikiUrl() {
        return "http://es.wikipedia.org/";
    }

    @Override
    public String getIso639() {
        return "es";
    }
}
