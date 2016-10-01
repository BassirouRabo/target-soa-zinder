
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object head_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class head extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*7.60*/routes/*7.66*/.Assets.versioned("images/favicon.png")),format.raw/*7.105*/("""">
    <title>Logiciel de Gestion Hydrocarbure</title>

    <link href=""""),_display_(/*10.18*/routes/*10.24*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*10.98*/("""" rel="stylesheet">
    <link href=""""),_display_(/*11.18*/routes/*11.24*/.Assets.versioned("bower_components/sidebar-nav/dist/sidebar-nav.min.css")),format.raw/*11.98*/("""" rel="stylesheet">
    <link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("bower_components/toast-master/css/jquery.toast.css")),format.raw/*12.95*/("""" rel="stylesheet">
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("bower_components/morrisjs/morris.css")),format.raw/*13.81*/("""" rel="stylesheet">
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("css/animate.css")),format.raw/*14.60*/("""" rel="stylesheet">
    <link href=""""),_display_(/*15.18*/routes/*15.24*/.Assets.versioned("css/style.css")),format.raw/*15.58*/("""" rel="stylesheet">
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("css/colors/blue-dark.css")),format.raw/*16.69*/("""" id="theme" rel="stylesheet">

    <style type="text/css" scoped>

    /* Sortable tables */
    table.sortable thead """),format.raw/*21.26*/("""{"""),format.raw/*21.27*/("""
    """),format.raw/*22.5*/("""background-color : #eee ;
    color : #666666 ;
    font-weight : bold ;
    cursor : default ;
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""

    """),format.raw/*28.5*/("""</style>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object head extends head_Scope0.head
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/head.scala.html
                  HASH: 029f734a781c26a04cf26323853dc004804b386b
                  MATRIX: 825->0|1152->301|1166->307|1226->346|1326->419|1341->425|1436->499|1500->536|1515->542|1610->616|1674->653|1689->659|1781->730|1845->767|1860->773|1938->830|2002->867|2017->873|2074->909|2138->946|2153->952|2208->986|2272->1023|2287->1029|2353->1074|2500->1193|2529->1194|2561->1199|2688->1299|2716->1300|2749->1306
                  LINES: 32->1|38->7|38->7|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|52->21|52->21|53->22|57->26|57->26|59->28
                  -- GENERATED --
              */
          