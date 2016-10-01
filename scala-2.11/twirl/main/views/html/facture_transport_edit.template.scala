
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_transport_edit_Scope0 {
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

     object facture_transport_edit_Scope1 {
import java.util

class facture_transport_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[FactureTransport,util.List[ClientTransport],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(facture: FactureTransport, clients: util.List[ClientTransport]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.66*/("""

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
                            <h4 class="page-title">Nos factures transports</h4>
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
                                <h3 class="box-title m-b-0">Modifier une facture de transport</h3>
                                <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*58.106*/facture/*58.113*/.getId),format.raw/*58.119*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-5">
                                            <select name="client.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(client <- clients) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),_display_(/*63.50*/if(client == facture.getClient)/*63.81*/ {_display_(Seq[Any](format.raw/*63.83*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/client/*64.75*/.getId),format.raw/*64.81*/("""" selected="selected">"""),_display_(/*64.104*/client/*64.110*/.getNom),format.raw/*64.117*/("""</option>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<option value=""""),_display_(/*66.69*/client/*66.75*/.getId),format.raw/*66.81*/("""">"""),_display_(/*66.84*/client/*66.90*/.getNom),format.raw/*66.97*/("""</option>
                                                """)))}),format.raw/*67.50*/("""
                                            """)))}),format.raw/*68.46*/("""
                                            """),format.raw/*69.45*/("""</select>
                                        </div>

                                        <div class="col-md-5">
                                            <input type="text" name="objet" placeholder="Objet" value=""""),_display_(/*73.105*/facture/*73.112*/.getObjet),format.raw/*73.121*/("""" class="form-control" required="required">
                                        </div>

                                        <div class="col-md-2">
                                            <input type="hidden" name="id" value=""""),_display_(/*77.84*/facture/*77.91*/.getId),format.raw/*77.97*/("""">
                                            <input type="hidden" name="referenceFactureProforma" value=""""),_display_(/*78.106*/facture/*78.113*/.getReferenceFactureProforma),format.raw/*78.141*/("""">
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

    """),_display_(/*94.6*/foot()),format.raw/*94.12*/("""

    """),format.raw/*96.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(facture:FactureTransport,clients:util.List[ClientTransport]): play.twirl.api.HtmlFormat.Appendable = apply(facture,clients)

  def f:((FactureTransport,util.List[ClientTransport]) => play.twirl.api.HtmlFormat.Appendable) = (facture,clients) => apply(facture,clients)

  def ref: this.type = this

}


}
}

/**/
object facture_transport_edit extends facture_transport_edit_Scope0.facture_transport_edit_Scope1.facture_transport_edit
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_transport_edit.scala.html
                  HASH: f3f635ce49ac0a89e151ee37b3038d9f7dc04863
                  MATRIX: 878->19|1037->83|1065->85|1129->124|1155->130|1185->133|2046->967|2073->973|2116->988|2588->1433|2627->1463|2667->1465|2728->1498|2973->1716|2987->1721|3021->1734|3082->1767|3149->1803|3206->1833|3247->1865|3287->1867|3348->1900|3593->2118|3607->2123|3643->2138|3710->2174|3763->2199|4168->2576|4185->2583|4213->2589|4530->2879|4568->2901|4608->2903|4685->2953|4725->2984|4765->2986|4846->3039|4889->3055|4904->3061|4931->3067|4982->3090|4998->3096|5027->3103|5105->3163|5118->3168|5157->3169|5238->3222|5281->3238|5296->3244|5323->3250|5353->3253|5368->3259|5396->3266|5486->3325|5563->3371|5636->3416|5889->3641|5906->3648|5937->3657|6202->3895|6218->3902|6245->3908|6381->4016|6398->4023|6448->4051|7057->4634|7084->4640|7117->4646
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|102->69|106->73|106->73|106->73|110->77|110->77|110->77|111->78|111->78|111->78|127->94|127->94|129->96
                  -- GENERATED --
              */
          