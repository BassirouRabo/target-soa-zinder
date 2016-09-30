
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sortie_article_Scope0 {
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

     object sortie_article_Scope1 {
import java.util

class sortie_article extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[SortieArticle,Long,util.List[Camion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(sortieArticle :  SortieArticle, idArticle: Long, camions: util.List[Camion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.79*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


"""),format.raw/*10.1*/("""<body class="fix-sidebar">
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


            """),_display_(/*27.14*/menu()),format.raw/*27.20*/("""


            """),format.raw/*30.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Modifier une sortie stock</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*40.30*/if(flash.containsKey("error"))/*40.60*/ {_display_(Seq[Any](format.raw/*40.62*/("""
                                """),format.raw/*41.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*43.38*/flash/*43.43*/.get("error")),format.raw/*43.56*/("""
                                """),format.raw/*44.33*/("""</div>
                            """)))}),format.raw/*45.30*/("""
                            """),_display_(/*46.30*/if(flash.containsKey("success"))/*46.62*/ {_display_(Seq[Any](format.raw/*46.64*/("""
                                """),format.raw/*47.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*49.38*/flash/*49.43*/.get("success")),format.raw/*49.58*/("""</div>
                            """)))}),format.raw/*50.30*/("""
                        """),format.raw/*51.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Modifier une sortie</h3>
                                <form class="form-horizontal" method="post" action="/articles/"""),_display_(/*58.96*/idArticle),format.raw/*58.105*/("""/sortie-articles/"""),_display_(/*58.123*/sortieArticle/*58.136*/.getId),format.raw/*58.142*/("""/update">
                                    <div class="col-md-6">
                                        <select name="camion.id" class="form-control">
                                            <option value="-">-</option>
                                            """),_display_(/*62.46*/for(camion <- camions) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),_display_(/*63.50*/if(sortieArticle.getCamion == camion)/*63.87*/ {_display_(Seq[Any](format.raw/*63.89*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/camion/*64.75*/.getId),format.raw/*64.81*/("""" selected="selected">"""),_display_(/*64.104*/camion/*64.110*/.getImmatriculation),format.raw/*64.129*/(""" """),format.raw/*64.130*/("""- """),_display_(/*64.133*/camion/*64.139*/.getProprietaire),format.raw/*64.155*/("""</option>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<option value=""""),_display_(/*66.69*/camion/*66.75*/.getId),format.raw/*66.81*/("""">"""),_display_(/*66.84*/camion/*66.90*/.getImmatriculation),format.raw/*66.109*/(""" """),format.raw/*66.110*/("""- """),_display_(/*66.113*/camion/*66.119*/.getProprietaire),format.raw/*66.135*/("""</option>
                                                """)))}),format.raw/*67.50*/("""
                                            """)))}),format.raw/*68.46*/("""
                                        """),format.raw/*69.41*/("""</select>
                                    </div>
                                    <div class="col-md-3">
                                        <select name="type" class="form-control" >
                                            """),_display_(/*73.46*/if(sortieArticle.getType.equals("Normale"))/*73.89*/ {_display_(Seq[Any](format.raw/*73.91*/("""
                                                """),format.raw/*74.49*/("""<option value="Normale" selected="selected">Normale</option>
                                            """)))}/*75.47*/else/*75.52*/{_display_(Seq[Any](format.raw/*75.53*/("""
                                                """),format.raw/*76.49*/("""<option value="Normale">Normale</option>
                                            """)))}),format.raw/*77.46*/("""
                                            """),_display_(/*78.46*/if(sortieArticle.getType.equals("Normale"))/*78.89*/ {_display_(Seq[Any](format.raw/*78.91*/("""
                                                """),format.raw/*79.49*/("""<option value="Perdu" selected="selected">Perdu</option>
                                            """)))}/*80.47*/else/*80.52*/{_display_(Seq[Any](format.raw/*80.53*/("""
                                                """),format.raw/*81.49*/("""<option value="Perdu">Perdu</option>
                                            """)))}),format.raw/*82.46*/("""
                                        """),format.raw/*83.41*/("""</select>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-3">
                                            <input name="quantite" type="number" class="form-control" value=""""),_display_(/*87.111*/sortieArticle/*87.124*/.getQuantite),format.raw/*87.136*/("""">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*93.84*/sortieArticle/*93.97*/.getId),format.raw/*93.103*/("""">
                                            <input name="article.id" type="hidden" value=""""),_display_(/*94.92*/idArticle),format.raw/*94.101*/("""">
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

    """),_display_(/*110.6*/foot()),format.raw/*110.12*/("""

    """),format.raw/*112.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(sortieArticle:SortieArticle,idArticle:Long,camions:util.List[Camion]): play.twirl.api.HtmlFormat.Appendable = apply(sortieArticle,idArticle,camions)

  def f:((SortieArticle,Long,util.List[Camion]) => play.twirl.api.HtmlFormat.Appendable) = (sortieArticle,idArticle,camions) => apply(sortieArticle,idArticle,camions)

  def ref: this.type = this

}


}
}

/**/
object sortie_article extends sortie_article_Scope0.sortie_article_Scope1.sortie_article
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:42 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/sortie_article.scala.html
                  HASH: 25e2711319499190e1abc8afa2521d6f26e66eee
                  MATRIX: 847->19|1019->96|1047->98|1111->137|1137->143|1167->146|2028->980|2055->986|2098->1001|2572->1448|2611->1478|2651->1480|2712->1513|2957->1731|2971->1736|3005->1749|3066->1782|3133->1818|3190->1848|3231->1880|3271->1882|3332->1915|3577->2133|3591->2138|3627->2153|3694->2189|3747->2214|4127->2567|4158->2576|4204->2594|4227->2607|4255->2613|4556->2887|4594->2909|4634->2911|4711->2961|4757->2998|4797->3000|4878->3053|4921->3069|4936->3075|4963->3081|5014->3104|5030->3110|5071->3129|5101->3130|5132->3133|5148->3139|5186->3155|5264->3215|5277->3220|5316->3221|5397->3274|5440->3290|5455->3296|5482->3302|5512->3305|5527->3311|5568->3330|5598->3331|5629->3334|5645->3340|5683->3356|5773->3415|5850->3461|5919->3502|6186->3742|6238->3785|6278->3787|6355->3836|6480->3943|6493->3948|6532->3949|6609->3998|6726->4084|6799->4130|6851->4173|6891->4175|6968->4224|7089->4327|7102->4332|7141->4333|7218->4382|7331->4464|7400->4505|7715->4792|7738->4805|7772->4817|8100->5118|8122->5131|8150->5137|8271->5231|8302->5240|8912->5823|8940->5829|8974->5835
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|102->69|106->73|106->73|106->73|107->74|108->75|108->75|108->75|109->76|110->77|111->78|111->78|111->78|112->79|113->80|113->80|113->80|114->81|115->82|116->83|120->87|120->87|120->87|126->93|126->93|126->93|127->94|127->94|143->110|143->110|145->112
                  -- GENERATED --
              */
          