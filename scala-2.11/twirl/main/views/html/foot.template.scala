
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object foot_Scope0 {
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

class foot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src=""""),_display_(/*1.15*/routes/*1.21*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*1.84*/(""""></script>
<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*2.93*/(""""></script>
<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.versioned("bower_components/sidebar-nav/dist/sidebar-nav.min.js")),format.raw/*3.94*/(""""></script>
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.versioned("js/jquery.slimscroll.js")),format.raw/*4.65*/(""""></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("js/waves.js")),format.raw/*5.53*/(""""></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("bower_components/waypoints/lib/jquery.waypoints.js")),format.raw/*6.92*/(""""></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("bower_components/counterup/jquery.counterup.min.js")),format.raw/*7.92*/(""""></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("bower_components/raphael/raphael-min.js")),format.raw/*8.81*/(""""></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("bower_components/morrisjs/morris.js")),format.raw/*9.77*/(""""></script>
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("js/custom.js")),format.raw/*10.54*/(""""></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("js/dashboard1.js")),format.raw/*11.58*/(""""></script>
<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.versioned("bower_components/peity/jquery.peity.min.js")),format.raw/*12.84*/(""""></script>
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.versioned("bower_components/peity/jquery.peity.init.js")),format.raw/*13.85*/(""""></script>
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.versioned("bower_components/styleswitcher/jQuery.style.switcher.js")),format.raw/*14.97*/(""""></script>
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("bower_components/jquery-sparkline/jquery.sparkline.min.js")),format.raw/*15.99*/(""""></script>
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.versioned("bower_components/jquery-sparkline/jquery.charts-sparkline.js")),format.raw/*16.102*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.versioned("bower_components/toast-master/js/jquery.toast.js")),format.raw/*17.90*/(""""></script>
<script src='"""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("js/jquery.number.js")),format.raw/*18.61*/("""' type="text/javascript"></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.versioned("js/filtre.js")),format.raw/*19.54*/(""""></script>
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.versioned("js/jquery.table2excel.min.js")),format.raw/*20.70*/(""""></script>
<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.versioned("js/sorttable.js")),format.raw/*21.57*/(""""></script>

<script type="text/javascript">
            $('span.number').number( true, 0, ',', ' ' );
        </script>

<script type="text/javascript">
            function convertData()"""),format.raw/*28.35*/("""{"""),format.raw/*28.36*/("""
                    """),format.raw/*29.21*/("""$("#printTable").table2excel("""),format.raw/*29.50*/("""{"""),format.raw/*29.51*/("""
                        """),format.raw/*30.25*/("""exclude: ".excludeThisClass",
                        name: "Worksheet Name",
                        filename: "export"
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/(""");
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""

            """),format.raw/*36.13*/("""$('.convert').on('click',function()"""),format.raw/*36.48*/("""{"""),format.raw/*36.49*/("""
                """),format.raw/*37.17*/("""convertData();
             """),format.raw/*38.14*/("""}"""),format.raw/*38.15*/(""");
        </script>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object foot extends foot_Scope0.foot
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:42 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/foot.scala.html
                  HASH: eae58b09008c0fe5d905e795ab42e54bc161bb33
                  MATRIX: 825->0|865->14|879->20|962->83|1014->109|1028->115|1120->187|1172->213|1186->219|1279->292|1331->318|1345->324|1409->368|1461->394|1475->400|1527->432|1579->458|1593->464|1684->535|1736->561|1750->567|1841->638|1893->664|1907->670|1987->730|2039->756|2053->762|2129->818|2182->844|2197->850|2251->883|2304->909|2319->915|2377->952|2430->978|2445->984|2529->1047|2582->1073|2597->1079|2682->1143|2735->1169|2750->1175|2847->1251|2900->1277|2915->1283|3014->1361|3067->1387|3082->1393|3185->1474|3238->1500|3253->1506|3343->1575|3396->1601|3411->1607|3472->1647|3548->1696|3563->1702|3617->1735|3670->1761|3685->1767|3755->1816|3808->1842|3823->1848|3880->1884|4096->2072|4125->2073|4174->2094|4231->2123|4260->2124|4313->2149|4482->2290|4511->2291|4558->2310|4587->2311|4629->2325|4692->2360|4721->2361|4766->2378|4822->2406|4851->2407
                  LINES: 32->1|32->1|32->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|59->28|59->28|60->29|60->29|60->29|61->30|64->33|64->33|65->34|65->34|67->36|67->36|67->36|68->37|69->38|69->38
                  -- GENERATED --
              */
          