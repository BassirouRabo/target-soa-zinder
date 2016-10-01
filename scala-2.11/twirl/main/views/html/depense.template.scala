
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object depense_Scope0 {
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

     object depense_Scope1 {
import java.util

class depense extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Depense,util.List[Camion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(depense: Depense, camions: util.List[Camion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.48*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


        """),format.raw/*10.9*/("""<body class="fix-sidebar">
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
                            <h4 class="page-title">Modifier une dépense administrative</h4>
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
                                <h3 class="box-title m-b-0">Modifier une depense</h3>
                                <form class="form-horizontal" method="post" action="/depenses/"""),_display_(/*58.96*/depense/*58.103*/.getId),format.raw/*58.109*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="beneficiaire" type="text" class="form-control" value=""""),_display_(/*61.113*/depense/*61.120*/.getBeneficiaire),format.raw/*61.136*/("""" required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="montant" type="number" min="0" class="form-control" value=""""),_display_(/*65.118*/depense/*65.125*/.getMontant),format.raw/*65.136*/("""" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="libelle" class="form-control" rows="5">"""),_display_(/*70.101*/depense/*70.108*/.getLibelle),format.raw/*70.119*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*76.84*/depense/*76.91*/.getId),format.raw/*76.97*/("""">
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

            """),_display_(/*92.14*/foot()),format.raw/*92.20*/("""

    """),format.raw/*94.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(depense:Depense,camions:util.List[Camion]): play.twirl.api.HtmlFormat.Appendable = apply(depense,camions)

  def f:((Depense,util.List[Camion]) => play.twirl.api.HtmlFormat.Appendable) = (depense,camions) => apply(depense,camions)

  def ref: this.type = this

}


}
}

/**/
object depense extends depense_Scope0.depense_Scope1.depense
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/depense.scala.html
                  HASH: c4f3f54f77779b6bde2467b67af3a7f9b9b51af2
                  MATRIX: 815->19|956->65|984->67|1048->106|1074->112|1112->123|1973->957|2000->963|2043->978|2527->1435|2566->1465|2606->1467|2667->1500|2912->1718|2926->1723|2960->1736|3021->1769|3088->1805|3145->1835|3186->1867|3226->1869|3287->1902|3532->2120|3546->2125|3582->2140|3649->2176|3702->2201|4083->2555|4100->2562|4128->2568|4402->2814|4419->2821|4457->2837|4736->3088|4753->3095|4786->3106|5152->3444|5169->3451|5202->3462|5539->3772|5555->3779|5582->3785|6200->4376|6227->4382|6260->4388
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|94->61|94->61|94->61|98->65|98->65|98->65|103->70|103->70|103->70|109->76|109->76|109->76|125->92|125->92|127->94
                  -- GENERATED --
              */
          