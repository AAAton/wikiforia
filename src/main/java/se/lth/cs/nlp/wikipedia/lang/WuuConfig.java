/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class WuuConfig extends TemplateConfig {
	public WuuConfig() {
		addNamespaceAlias(-2, "媒体文件", "媒体");
		addNamespaceAlias(-1, "特殊", "特殊");
		addNamespaceAlias(1, "讨论", "对话", "讨论");
		addNamespaceAlias(2, "用户", "用户");
		addNamespaceAlias(3, "用户讨论", "用户对话", "用户讨论");
		addNamespaceAlias(5, "Wikipedia讨论");
		addNamespaceAlias(6, "文件", "图像", "档案", "文件", "Image");
		addNamespaceAlias(7, "文件讨论", "Image_talk", "图像对话", "图像讨论", "档案对话", "档案讨论", "文件对话", "文件讨论");
		addNamespaceAlias(8, "MediaWiki");
		addNamespaceAlias(9, "MediaWiki讨论");
		addNamespaceAlias(10, "模板", "模板");
		addNamespaceAlias(11, "模板讨论", "模板对话", "模板讨论");
		addNamespaceAlias(12, "帮助", "帮助");
		addNamespaceAlias(13, "帮助讨论", "帮助对话", "帮助讨论");
		addNamespaceAlias(14, "分类", "分类");
		addNamespaceAlias(15, "分类讨论", "分类对话", "分类讨论");

		addI18nCIAlias("redirect", "#重定向", "#REDIRECT");
		addI18nCIAlias("notoc", "__无目录__", "__NOTOC__");
		addI18nCIAlias("nogallery", "__无图库__", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__强显目录__", "__FORCETOC__");
		addI18nCIAlias("toc", "__目录__", "__TOC__");
		addI18nCIAlias("noeditsection", "__无编辑段落__", "__无段落编辑__", "__NOEDITSECTION__");
		addI18nAlias("currentmonth", "本月", "本月2", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "本月1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "本月名", "本月名称", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "本月名属格", "本月名称属格", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "本月简称", "CURRENTMONTHABBREV");
		addI18nAlias("currentday", "今天", "CURRENTDAY");
		addI18nAlias("currentday2", "今天2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "星期", "今天名", "今天名称", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "今年", "CURRENTYEAR");
		addI18nAlias("currenttime", "当前时间", "此时", "CURRENTTIME");
		addI18nAlias("currenthour", "当前小时", "CURRENTHOUR");
		addI18nAlias("localmonth", "本地月", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonthname", "本地月份名", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "本地月历", "LOCALMONTHNAMEGEN");
		addI18nAlias("localday", "本地日", "LOCALDAY");
		addI18nAlias("localdayname", "本地日名", "LOCALDAYNAME");
		addI18nAlias("localyear", "本地年", "LOCALYEAR");
		addI18nAlias("localtime", "本地时间", "LOCALTIME");
		addI18nAlias("localhour", "本地小时", "LOCALHOUR");
		addI18nAlias("numberofpages", "页面数", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "条目数", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "文件数", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "用户数", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "活跃用户数", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "编辑数", "NUMBEROFEDITS");
		addI18nAlias("numberofviews", "访问数", "NUMBEROFVIEWS");
		addI18nAlias("pagename", "页名", "页面名", "页面名称", "PAGENAME");
		addI18nAlias("pagenamee", "页名等同", "页面名等同", "页面名E", "PAGENAMEE");
		addI18nAlias("namespace", "名字空间", "NAMESPACE");
		addI18nAlias("namespacee", "名字空间等同", "名字空间E", "NAMESPACEE");
		addI18nAlias("namespacenumber", "名字空间编号", "NAMESPACENUMBER");
		addI18nAlias("talkspace", "讨论空间", "讨论名字空间", "TALKSPACE");
		addI18nAlias("talkspacee", "讨论空间等同", "讨论名字空间E", "TALKSPACEE");
		addI18nAlias("fullpagename", "页面全名", "完整页面名", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "完整页面名E", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "子页面名", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "子页面名等同", "子页面名E", "SUBPAGENAMEE");
		addI18nAlias("talkpagename", "讨论页面名", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "讨论页面名等同", "讨论页面名E", "TALKPAGENAMEE");
		addI18nCIAlias("subst", "替代:", "SUBST:");
		addI18nCIAlias("safesubst", "安全替代:", "SAFESUBST:");
		addI18nAlias("img_thumbnail", "缩略图", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "缩略图=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "右", "right");
		addI18nAlias("img_left", "左", "left");
		addI18nAlias("img_none", "无", "none");
		addI18nAlias("img_width", "$1像素", "$1px");
		addI18nAlias("img_center", "居中", "center", "centre");
		addI18nAlias("img_framed", "有框", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "无框", "frameless");
		addI18nAlias("img_page", "页数=$1", "$1页", "page=$1", "page $1");
		addI18nAlias("img_border", "边框", "border");
		addI18nAlias("img_link", "链接=$1", "link=$1");
		addI18nAlias("img_alt", "替代=$1", "替代文本=$1", "alt=$1");
		addI18nAlias("img_class", "类=$1", "class=$1");
		addI18nCIAlias("int", "界面:", "INT:");
		addI18nAlias("sitename", "站点名称", "SITENAME");
		addI18nCIAlias("ns", "名字空间:", "NS:");
		addI18nCIAlias("nse", "名字空间E:", "NSE:");
		addI18nCIAlias("localurl", "本地URL:", "LOCALURL:");
		addI18nCIAlias("localurle", "本地URLE:", "LOCALURLE:");
		addI18nCIAlias("articlepath", "条目路径", "ARTICLEPATH");
		addI18nCIAlias("pageid", "页面ID", "PAGEID");
		addI18nCIAlias("server", "服务器", "SERVER");
		addI18nCIAlias("servername", "服务器名", "SERVERNAME");
		addI18nCIAlias("scriptpath", "脚本路径", "SCRIPTPATH");
		addI18nCIAlias("stylepath", "样式路径", "STYLEPATH");
		addI18nCIAlias("grammar", "语法:", "GRAMMAR:");
		addI18nCIAlias("gender", "性:", "性别:", "GENDER:");
		addI18nCIAlias("notitleconvert", "__不转换标题__", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__不转换内容__", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("currentweek", "本周", "CURRENTWEEK");
		addI18nCIAlias("plural", "复数:", "PLURAL:");
		addI18nCIAlias("fullurl", "完整URL:", "FULLURL:");
		addI18nCIAlias("fullurle", "完整URL等同:", "完整URLE:", "FULLURLE:");
		addI18nCIAlias("lcfirst", "小写首字:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "大写首字:", "UCFIRST:");
		addI18nCIAlias("lc", "小写:", "LC:");
		addI18nCIAlias("uc", "大写:", "UC:");
		addI18nAlias("displaytitle", "显示标题", "DISPLAYTITLE");
		addI18nAlias("newsectionlink", "__新段落链接__", "__NEWSECTIONLINK__");
		addI18nAlias("nonewsectionlink", "__无新段落链接__", "__NONEWSECTIONLINK__");
		addI18nAlias("currentversion", "当前版本", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "URL编码:", "URLENCODE:");
		addI18nCIAlias("anchorencode", "锚编码", "ANCHORENCODE");
		addI18nAlias("currenttimestamp", "当前时间戳", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "本地时间戳", "LOCALTIMESTAMP");
		addI18nAlias("directionmark", "方向标记", "DIRECTIONMARK", "DIRMARK");
		addI18nCIAlias("language", "#语言:", "#LANGUAGE:");
		addI18nAlias("contentlanguage", "内容语言", "CONTENTLANGUAGE", "CONTENTLANG");
		addI18nAlias("pagesinnamespace", "名字空间中页面数:", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "管理员数", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "格式化数字", "FORMATNUM");
		addI18nCIAlias("padleft", "左填充", "PADLEFT");
		addI18nCIAlias("padright", "右填充", "PADRIGHT");
		addI18nCIAlias("special", "特殊", "special");
		addI18nCIAlias("speciale", "特殊等同", "特殊e", "speciale");
		addI18nAlias("defaultsort", "默认排序:", "默认排序关键字:", "默认分类排序:", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "文件路径:", "FILEPATH:");
		addI18nCIAlias("tag", "标记", "tag");
		addI18nAlias("hiddencat", "__隐藏分类__", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "分类中页数", "分类中页面数", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "页面大小", "PAGESIZE");
		addI18nAlias("index", "__索引__", "__INDEX__");
		addI18nAlias("noindex", "__不索引__", "__NOINDEX__");
		addI18nAlias("numberingroup", "组中用户数", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__静态重定向__", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "保护级别", "PROTECTIONLEVEL");
		addI18nCIAlias("formatdate", "格式化日期", "日期格式化", "formatdate", "dateformat");
		addI18nCIAlias("defaultsort_noerror", "不报错", "noerror");
		addI18nCIAlias("defaultsort_noreplace", "不替换", "noreplace");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://wuu.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "wuu";
	}
}
