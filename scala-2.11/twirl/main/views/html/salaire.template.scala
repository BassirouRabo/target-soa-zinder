
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object salaire_Scope0 {
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

     object salaire_Scope1 {
import java.util

class salaire extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Salaire,util.List[Personnel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(salaire: Salaire, personnels: util.List[Personnel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.54*/("""

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
                            <h4 class="page-title">Nos salaires</h4>
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
                                <h3 class="box-title m-b-0">Modifier une avance</h3>
                                <form class="form-horizontal" method="post" action="/salaires/"""),_display_(/*58.96*/salaire/*58.103*/.getId),format.raw/*58.109*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-3">
                                            <select name="personnel.id" class="form-control">
                                            """),_display_(/*62.46*/for(personnel <- personnels) yield /*62.74*/ {_display_(Seq[Any](format.raw/*62.76*/("""
                                                """),_display_(/*63.50*/if(salaire.getPersonnel == personnel)/*63.87*/ {_display_(Seq[Any](format.raw/*63.89*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/personnel/*64.78*/.getId),format.raw/*64.84*/("""" selected="selected">"""),_display_(/*64.107*/personnel/*64.116*/.getNom),format.raw/*64.123*/(""" """),_display_(/*64.125*/personnel/*64.134*/.getPrenom),format.raw/*64.144*/("""</option>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<option value=""""),_display_(/*66.69*/personnel/*66.78*/.getId),format.raw/*66.84*/("""">"""),_display_(/*66.87*/personnel/*66.96*/.getNom),format.raw/*66.103*/(""" """),_display_(/*66.105*/personnel/*66.114*/.getPrenom),format.raw/*66.124*/("""</option>
                                                """)))}),format.raw/*67.50*/("""
                                            """)))}),format.raw/*68.46*/("""
                                            """),format.raw/*69.45*/("""</select>
                                        </div>

                                        <div class="col-md-3">
                                            <input name="avance" type="number" min="0" class="form-control" value=""""),_display_(/*73.117*/salaire/*73.124*/.getAvance),format.raw/*73.134*/("""" placeholder="avance">
                                        </div>

                                        <div class="col-md-3">
                                        """),_display_(/*77.42*/if(null == salaire.getWhenDone)/*77.73*/ {_display_(Seq[Any](format.raw/*77.75*/("""
                                            """),format.raw/*78.45*/("""<input name="whenDone" type="text" pattern="[0-9]"""),format.raw/*78.94*/("""{"""),format.raw/*78.95*/("""2"""),format.raw/*78.96*/("""}"""),format.raw/*78.97*/("""-[0-9]"""),format.raw/*78.103*/("""{"""),format.raw/*78.104*/("""2"""),format.raw/*78.105*/("""}"""),format.raw/*78.106*/("""-[0-9]"""),format.raw/*78.112*/("""{"""),format.raw/*78.113*/("""4"""),format.raw/*78.114*/("""}"""),format.raw/*78.115*/(""""  class="form-control" placeholder="Date">
                                        """)))}/*79.43*/else/*79.48*/{_display_(Seq[Any](format.raw/*79.49*/("""
                                            """),format.raw/*80.45*/("""<input name="whenDone" type="text" pattern="[0-9]"""),format.raw/*80.94*/("""{"""),format.raw/*80.95*/("""2"""),format.raw/*80.96*/("""}"""),format.raw/*80.97*/("""-[0-9]"""),format.raw/*80.103*/("""{"""),format.raw/*80.104*/("""2"""),format.raw/*80.105*/("""}"""),format.raw/*80.106*/("""-[0-9]"""),format.raw/*80.112*/("""{"""),format.raw/*80.113*/("""4"""),format.raw/*80.114*/("""}"""),format.raw/*80.115*/(""""  class="form-control" value=""""),_display_(/*80.147*/salaire/*80.154*/.getAvance.formatted("dd-MM-yyyy")),format.raw/*80.188*/(""")" placeholder="Date">
                                            """)))}),format.raw/*81.46*/("""
                                        """),format.raw/*82.41*/("""</div>

                                        <div class="col-md-3">
                                            <input name="id" type="hidden" value=""""),_display_(/*85.84*/salaire/*85.91*/.getId),format.raw/*85.97*/("""">
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

    """),_display_(/*101.6*/foot()),format.raw/*101.12*/("""

    """),format.raw/*103.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(salaire:Salaire,personnels:util.List[Personnel]): play.twirl.api.HtmlFormat.Appendable = apply(salaire,personnels)

  def f:((Salaire,util.List[Personnel]) => play.twirl.api.HtmlFormat.Appendable) = (salaire,personnels) => apply(salaire,personnels)

  def ref: this.type = this

}


}
}

/**/
object salaire extends salaire_Scope0.salaire_Scope1.salaire
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/salaire.scala.html
                  HASH: 3ec3cfd332e88c479b53bd9a8163594e4733d1ce
                  MATRIX: 818->19|965->71|993->73|1057->112|1083->118|1113->121|1974->955|2001->961|2044->976|2505->1410|2544->1440|2584->1442|2645->1475|2890->1693|2904->1698|2938->1711|2999->1744|3066->1780|3123->1810|3164->1842|3204->1844|3265->1877|3510->2095|3524->2100|3560->2115|3627->2151|3680->2176|4060->2529|4077->2536|4105->2542|4405->2815|4449->2843|4489->2845|4566->2895|4612->2932|4652->2934|4733->2987|4776->3003|4794->3012|4821->3018|4872->3041|4891->3050|4920->3057|4950->3059|4969->3068|5001->3078|5079->3138|5092->3143|5131->3144|5212->3197|5255->3213|5273->3222|5300->3228|5330->3231|5348->3240|5377->3247|5407->3249|5426->3258|5458->3268|5548->3327|5625->3373|5698->3418|5963->3655|5980->3662|6012->3672|6215->3848|6255->3879|6295->3881|6368->3926|6445->3975|6474->3976|6503->3977|6532->3978|6567->3984|6597->3985|6627->3986|6657->3987|6692->3993|6722->3994|6752->3995|6782->3996|6886->4082|6899->4087|6938->4088|7011->4133|7088->4182|7117->4183|7146->4184|7175->4185|7210->4191|7240->4192|7270->4193|7300->4194|7335->4200|7365->4201|7395->4202|7425->4203|7485->4235|7502->4242|7558->4276|7657->4344|7726->4385|7907->4539|7923->4546|7950->4552|8560->5135|8588->5141|8622->5147
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|102->69|106->73|106->73|106->73|110->77|110->77|110->77|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|114->81|115->82|118->85|118->85|118->85|134->101|134->101|136->103
                  -- GENERATED --
              */
          