
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object demande_travaux_edit_Scope0 {
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

class demande_travaux_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Reparation,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reparation: Reparation):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

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
                            <h4 class="page-title">Demande de travaux</h4>
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
                                <h3 class="box-title m-b-0">Modifier une demande de travaux</h3>
                                <form class="form-horizontal" method="post" action="/demande-travaux/"""),_display_(/*57.103*/reparation/*57.113*/.getId),format.raw/*57.119*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="service" type="text" class="form-control" placeholder="Service" value=""""),_display_(/*60.130*/reparation/*60.140*/.getService),format.raw/*60.151*/("""" required="required">
                                        </div>
                                        <div class="col-md-6">
                                            <select name="affectation" class="form-control">
                                                """),_display_(/*64.50*/if(reparation.getAffectation.equals("GE"))/*64.92*/ {_display_(Seq[Any](format.raw/*64.94*/("""
                                                    """),format.raw/*65.53*/("""<option value="GE" selected="selected">GE</option>
                                                """)))}/*66.51*/else/*66.56*/{_display_(Seq[Any](format.raw/*66.57*/("""
                                                    """),format.raw/*67.53*/("""<option value="GE">GE</option>
                                                """)))}),format.raw/*68.50*/("""
                                                """),_display_(/*69.50*/if(reparation.getAffectation.equals("GPL"))/*69.93*/ {_display_(Seq[Any](format.raw/*69.95*/("""
                                                    """),format.raw/*70.53*/("""<option value="GPL" selected="selected">GPL</option>
                                                """)))}/*71.51*/else/*71.56*/{_display_(Seq[Any](format.raw/*71.57*/("""
                                                    """),format.raw/*72.53*/("""<option value="GPL">GPL</option>
                                                """)))}),format.raw/*73.50*/("""
                                            """),format.raw/*74.45*/("""</select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="kilometrageDebut" type="text" class="form-control" value=""""),_display_(/*79.117*/reparation/*79.127*/.getKilometrageDebut),format.raw/*79.147*/("""" placeholder="Kilometrage début">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="kilometrageFin" type="text" class="form-control" value=""""),_display_(/*82.115*/reparation/*82.125*/.getKilometrageFin),format.raw/*82.143*/("""" placeholder="Kilometrage fin">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nomReparateur" type="text" class="form-control" value=""""),_display_(/*87.114*/reparation/*87.124*/.getNomReparateur),format.raw/*87.141*/("""" placeholder="Nom réparateur">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="prenomReparateur" type="text" class="form-control" value=""""),_display_(/*90.117*/reparation/*90.127*/.getPrenomReparateur),format.raw/*90.147*/("""" placeholder="Prénom réparateur">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-6">
                                        """),_display_(/*96.42*/if(null == reparation.getDateDemandeTravaux)/*96.86*/ {_display_(Seq[Any](format.raw/*96.88*/("""
                                            """),format.raw/*97.45*/("""<input name="dateDemandeTravaux" type="text"  pattern="[0-9]"""),format.raw/*97.105*/("""{"""),format.raw/*97.106*/("""2"""),format.raw/*97.107*/("""}"""),format.raw/*97.108*/("""-[0-9]"""),format.raw/*97.114*/("""{"""),format.raw/*97.115*/("""2"""),format.raw/*97.116*/("""}"""),format.raw/*97.117*/("""-[0-9]"""),format.raw/*97.123*/("""{"""),format.raw/*97.124*/("""4"""),format.raw/*97.125*/("""}"""),format.raw/*97.126*/(""""  class="form-control" placeholder="Date demande de travaux" required="required">
                                        """)))}/*98.43*/else/*98.48*/{_display_(Seq[Any](format.raw/*98.49*/("""
                                            """),format.raw/*99.45*/("""<input name="dateDemandeTravaux" type="text" pattern="[0-9]"""),format.raw/*99.104*/("""{"""),format.raw/*99.105*/("""2"""),format.raw/*99.106*/("""}"""),format.raw/*99.107*/("""-[0-9]"""),format.raw/*99.113*/("""{"""),format.raw/*99.114*/("""2"""),format.raw/*99.115*/("""}"""),format.raw/*99.116*/("""-[0-9]"""),format.raw/*99.122*/("""{"""),format.raw/*99.123*/("""4"""),format.raw/*99.124*/("""}"""),format.raw/*99.125*/(""""  value=""""),_display_(/*99.136*/reparation/*99.146*/.getDateDemandeTravaux.format("dd-MM-yyyy")),format.raw/*99.189*/("""" class="form-control" placeholder="Date demande de travaux" required="required">
                                            """)))}),format.raw/*100.46*/("""
                                        """),format.raw/*101.41*/("""</div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="commentaireControleur" class="form-control" rows="5" placeholder="Commantaire controleur">"""),_display_(/*106.152*/reparation/*106.162*/.getCommentaireControleur),format.raw/*106.187*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*112.84*/reparation/*112.94*/.getId),format.raw/*112.100*/("""">
                                            <input name="numero" type="hidden" value=""""),_display_(/*113.88*/reparation/*113.98*/.getNumero),format.raw/*113.108*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Mettre à jour</button>
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

            """),_display_(/*129.14*/foot()),format.raw/*129.20*/("""

    """),format.raw/*131.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(reparation:Reparation): play.twirl.api.HtmlFormat.Appendable = apply(reparation)

  def f:((Reparation) => play.twirl.api.HtmlFormat.Appendable) = (reparation) => apply(reparation)

  def ref: this.type = this

}


}

/**/
object demande_travaux_edit extends demande_travaux_edit_Scope0.demande_travaux_edit
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/demande_travaux_edit.scala.html
                  HASH: 1267e8d7e04e11502a650c22dd3091e164b87622
                  MATRIX: 779->1|898->25|926->27|990->66|1016->72|1053->83|1914->917|1941->923|1984->938|2451->1378|2490->1408|2530->1410|2591->1443|2836->1661|2850->1666|2884->1679|2945->1712|3012->1748|3069->1778|3110->1810|3150->1812|3211->1845|3456->2063|3470->2068|3506->2083|3573->2119|3626->2144|4026->2516|4046->2526|4074->2532|4365->2795|4385->2805|4418->2816|4720->3091|4771->3133|4811->3135|4892->3188|5011->3289|5024->3294|5063->3295|5144->3348|5255->3428|5332->3478|5384->3521|5424->3523|5505->3576|5626->3679|5639->3684|5678->3685|5759->3738|5872->3820|5945->3865|6313->4205|6333->4215|6375->4235|6662->4494|6682->4504|6722->4522|7110->4882|7130->4892|7169->4909|7455->5167|7475->5177|7517->5197|7835->5488|7888->5532|7928->5534|8001->5579|8090->5639|8120->5640|8150->5641|8180->5642|8215->5648|8245->5649|8275->5650|8305->5651|8340->5657|8370->5658|8400->5659|8430->5660|8573->5785|8586->5790|8625->5791|8698->5836|8786->5895|8816->5896|8846->5897|8876->5898|8911->5904|8941->5905|8971->5906|9001->5907|9036->5913|9066->5914|9096->5915|9126->5916|9165->5927|9185->5937|9250->5980|9409->6107|9479->6148|9835->6475|9856->6485|9904->6510|10242->6820|10262->6830|10291->6836|10409->6926|10429->6936|10462->6946|11086->7542|11114->7548|11148->7554
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|57->26|57->26|60->29|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|81->50|88->57|88->57|88->57|91->60|91->60|91->60|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|103->72|104->73|105->74|110->79|110->79|110->79|113->82|113->82|113->82|118->87|118->87|118->87|121->90|121->90|121->90|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|131->100|132->101|137->106|137->106|137->106|143->112|143->112|143->112|144->113|144->113|144->113|160->129|160->129|162->131
                  -- GENERATED --
              */
          