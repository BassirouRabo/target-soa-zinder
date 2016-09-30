
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object entree_article_Scope0 {
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

class entree_article extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[EntreeArticle,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entreeArticle :  EntreeArticle, idArticle: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*6.6*/head()),format.raw/*6.12*/("""


        """),format.raw/*9.9*/("""<body class="fix-sidebar">
            <!-- Preloader -->
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>
        <div id="wrapper">
                <!-- Top Navigation -->
            <nav class="navbar navbar-default navbar-static-top m-b-0">
                <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="ti-menu"></i></a>

                    <ul class="nav navbar-top-links navbar-left hidden-xs">
                        <li><a href="javascript:void(0)" class="open-close hidden-xs waves-effect waves-light"><i class="icon-arrow-left-circle ti-menu"></i></a></li>
                    </ul>
                </div>
            </nav>


            """),_display_(/*26.14*/menu()),format.raw/*26.20*/("""


            """),format.raw/*29.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Modifier une entree stock</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*39.30*/if(flash.containsKey("error"))/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
                                """),format.raw/*40.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*42.38*/flash/*42.43*/.get("error")),format.raw/*42.56*/("""
                                """),format.raw/*43.33*/("""</div>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(flash.containsKey("success"))/*45.62*/ {_display_(Seq[Any](format.raw/*45.64*/("""
                                """),format.raw/*46.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*48.38*/flash/*48.43*/.get("success")),format.raw/*48.58*/("""</div>
                            """)))}),format.raw/*49.30*/("""
                        """),format.raw/*50.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Modifier une entree</h3>
                                <form class="form-horizontal" method="post" action="/articles/"""),_display_(/*57.96*/idArticle),format.raw/*57.105*/("""/entree-articles/"""),_display_(/*57.123*/entreeArticle/*57.136*/.getId),format.raw/*57.142*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="provenance" type="text" class="form-control" value=""""),_display_(/*60.111*/entreeArticle/*60.124*/.getProvenance),format.raw/*60.138*/("""" required="required">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="quantite" type="number" class="form-control" value=""""),_display_(/*63.111*/entreeArticle/*63.124*/.getQuantite),format.raw/*63.136*/("""">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*68.84*/entreeArticle/*68.97*/.getId),format.raw/*68.103*/("""">
                                            <input name="article.id" type="hidden" value=""""),_display_(/*69.92*/idArticle),format.raw/*69.101*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*85.14*/foot()),format.raw/*85.20*/("""

    """),format.raw/*87.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(entreeArticle:EntreeArticle,idArticle:Long): play.twirl.api.HtmlFormat.Appendable = apply(entreeArticle,idArticle)

  def f:((EntreeArticle,Long) => play.twirl.api.HtmlFormat.Appendable) = (entreeArticle,idArticle) => apply(entreeArticle,idArticle)

  def ref: this.type = this

}


}

/**/
object entree_article extends entree_article_Scope0.entree_article
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/entree_article.scala.html
                  HASH: b10f1b8f2daf0a15bfb6ef2400484f9b6c9bb772
                  MATRIX: 775->1|919->50|947->52|1011->91|1037->97|1074->108|1935->942|1962->948|2005->963|2479->1410|2518->1440|2558->1442|2619->1475|2864->1693|2878->1698|2912->1711|2973->1744|3040->1780|3097->1810|3138->1842|3178->1844|3239->1877|3484->2095|3498->2100|3534->2115|3601->2151|3654->2176|4034->2529|4065->2538|4111->2556|4134->2569|4162->2575|4434->2819|4457->2832|4493->2846|4764->3089|4787->3102|4821->3114|5148->3414|5170->3427|5198->3433|5319->3527|5350->3536|5968->4127|5995->4133|6028->4139
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|57->26|57->26|60->29|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|81->50|88->57|88->57|88->57|88->57|88->57|91->60|91->60|91->60|94->63|94->63|94->63|99->68|99->68|99->68|100->69|100->69|116->85|116->85|118->87
                  -- GENERATED --
              */
          