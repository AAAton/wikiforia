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

public class ArcConfig extends TemplateConfig {
	public ArcConfig() {
		addNamespaceAlias(-2, "ܡܝܕܝܐ");
		addNamespaceAlias(-1, "ܕܝܠܢܝܐ");
		addNamespaceAlias(0, "");
		addNamespaceAlias(1, "ܡܡܠܠܐ");
		addNamespaceAlias(2, "ܡܦܠܚܢܐ", "ܡܬܚܫܚܢܐ");
		addNamespaceAlias(3, "ܡܡܠܠܐ_ܕܡܦܠܚܢܐ", "ܡܡܠܠܐ_ܕܡܬܚܫܚܢܐ");
		addNamespaceAlias(5, "ܡܡܠܠܐ_ܕWikipedia");
		addNamespaceAlias(6, "ܠܦܦܐ");
		addNamespaceAlias(7, "ܡܡܠܠܐ_ܕܠܦܦܐ");
		addNamespaceAlias(8, "ܡܝܕܝܐܘܝܩܝ");
		addNamespaceAlias(9, "ܡܡܠܠܐ_ܕܡܝܕܝܐܘܝܩܝ");
		addNamespaceAlias(10, "ܩܠܒܐ");
		addNamespaceAlias(11, "ܡܡܠܠܐ_ܕܩܠܒܐ");
		addNamespaceAlias(12, "ܥܘܕܪܢܐ");
		addNamespaceAlias(13, "ܡܡܠܠܐ_ܕܥܘܕܪܢܐ");
		addNamespaceAlias(14, "ܣܕܪܐ");
		addNamespaceAlias(15, "ܡܡܠܠܐ_ܕܣܕܪܐ");

		addI18nCIAlias("redirect", "#ܨܘܝܒܐ", "#REDIRECT");
		addI18nAlias("numberofpages", "ܡܢܝܢܐ_ܕܦܐܬܬ̈ܐ", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "ܡܢܝܢܐ_ܕܡܠܘܐ̈ܐ", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "ܡܢܝܢܐ_ܕܠܦܦ̈ܐ", "NUMBEROFFILES");
		addI18nAlias("pagename", "ܫܡܐ_ܕܦܐܬܐ", "PAGENAME");
		addI18nAlias("pagenamee", "ܟܘܢܝܐ_ܕܦܐܬܐ", "PAGENAMEE");
		addI18nAlias("namespace", "ܚܩܠܐ", "NAMESPACE");
		addI18nCIAlias("msg", "ܐܓܪܬܐ:", "MSG:");
		addI18nAlias("img_thumbnail", "ܙܥܘܪܬܐ", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "ܙܥܘܪܬܐ=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "ܝܡܝܢܐ", "right");
		addI18nAlias("img_left", "ܣܡܠܐ", "left");
		addI18nAlias("img_none", "ܠܐ_ܡܕܡ", "none");
		addI18nAlias("img_center", "ܡܨܥܐ", "center", "centre");
		addI18nAlias("img_page", "ܦܐܬܐ=$1", "ܦܐܬܐ $1", "page=$1", "page $1");
		addI18nAlias("img_border", "ܬܚܘܡܐ", "border");
		addI18nAlias("img_baseline", "ܣܪܛܐ_ܫܪܫܝܐ", "baseline");
		addI18nAlias("img_sub", "ܦܪܥܝܐ", "sub");
		addI18nCIAlias("grammar", "ܬܘܪܨ_ܡܡܠܠܐ:", "GRAMMAR:");
		addI18nCIAlias("gender", "ܓܢܣܐ:", "GENDER:");
		addI18nCIAlias("language", "#ܠܫܢܐ:", "#LANGUAGE:");
		addI18nCIAlias("special", "ܕܝܠܢܝܐ", "special");
		addI18nCIAlias("url_path", "ܫܒܝܠܐ", "PATH");
		addI18nCIAlias("url_wiki", "ܘܝܩܝ", "WIKI");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://arc.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "arc";
	}
}
