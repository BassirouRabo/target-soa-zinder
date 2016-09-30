
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object produit_Scope0 {
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

class produit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Produit,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(produit: Produit):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*6.6*/head()),format.raw/*6.12*/("""


"""),format.raw/*9.1*/("""<body class="fix-sidebar">
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
                            <h4 class="page-title">Nos produits</h4>
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
                                <h3 class="box-title m-b-0">Modifier un produit</h3>
                                <form class="form-horizontal" method="post" action="/produits/"""),_display_(/*57.96*/produit/*57.103*/.getId),format.raw/*57.109*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" value=""""),_display_(/*60.104*/produit/*60.111*/.getNom),format.raw/*60.118*/("""" required="required" placeholder="Désignation">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prixAchat" type="number" min="0" class="form-control" value=""""),_display_(/*64.120*/produit/*64.127*/.getPrixAchat),format.raw/*64.140*/("""" placeholder="Prix Achat">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="prixVente" type="number" class="form-control" value=""""),_display_(/*69.112*/produit/*69.119*/.getPrixVente),format.raw/*69.132*/("""" placeholder="Prix Vente">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prixTransport" type="number" min="0" class="form-control" value=""""),_display_(/*73.124*/produit/*73.131*/.getPrixTransport),format.raw/*73.148*/("""" placeholder="Prix Transport">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*79.84*/produit/*79.91*/.getId),format.raw/*79.97*/("""">
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

    """),_display_(/*95.6*/foot()),format.raw/*95.12*/("""

    """),format.raw/*97.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(produit:Produit): play.twirl.api.HtmlFormat.Appendable = apply(produit)

  def f:((Produit) => play.twirl.api.HtmlFormat.Appendable) = (produit) => apply(produit)

  def ref: this.type = this

}


}

/**/
object produit extends produit_Scope0.produit
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/produit.scala.html
                  HASH: 165f5239a9c0afde474fe08f5f0e96f71b374d94
                  MATRIX: 750->1|863->19|891->21|955->60|981->66|1010->69|1871->903|1898->909|1941->924|2402->1358|2441->1388|2481->1390|2542->1423|2787->1641|2801->1646|2835->1659|2896->1692|2963->1728|3020->1758|3061->1790|3101->1792|3162->1825|3407->2043|3421->2048|3457->2063|3524->2099|3577->2124|3957->2477|3974->2484|4002->2490|4267->2727|4284->2734|4313->2741|4620->3020|4637->3027|4672->3040|5053->3393|5070->3400|5105->3413|5395->3675|5412->3682|5451->3699|5808->4029|5824->4036|5851->4042|6460->4625|6487->4631|6520->4637
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|57->26|57->26|60->29|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|81->50|88->57|88->57|88->57|91->60|91->60|91->60|95->64|95->64|95->64|100->69|100->69|100->69|104->73|104->73|104->73|110->79|110->79|110->79|126->95|126->95|128->97
                  -- GENERATED --
              */
          