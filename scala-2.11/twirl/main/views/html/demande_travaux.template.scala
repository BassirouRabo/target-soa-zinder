
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object demande_travaux_Scope0 {
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

     object demande_travaux_Scope1 {
import java.util

class demande_travaux extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Reparation,util.List[Taf],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparation: Reparation, tafs: util.List[Taf]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.math.BigInteger; var i = 0;

Seq[Any](format.raw/*2.48*/(""";
"""),format.raw/*4.1*/("""
 """),format.raw/*5.2*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*8.6*/head()),format.raw/*8.12*/("""


"""),format.raw/*11.1*/("""<body class="fix-sidebar">
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


            """),_display_(/*28.14*/menu()),format.raw/*28.20*/("""


            """),format.raw/*31.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Demande de travaux</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*41.30*/if(flash.containsKey("error"))/*41.60*/ {_display_(Seq[Any](format.raw/*41.62*/("""
                                """),format.raw/*42.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*44.38*/flash/*44.43*/.get("error")),format.raw/*44.56*/("""
                                """),format.raw/*45.33*/("""</div>
                            """)))}),format.raw/*46.30*/("""
                            """),_display_(/*47.30*/if(flash.containsKey("success"))/*47.62*/ {_display_(Seq[Any](format.raw/*47.64*/("""
                                """),format.raw/*48.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*50.38*/flash/*50.43*/.get("success")),format.raw/*50.58*/("""</div>
                            """)))}),format.raw/*51.30*/("""
                        """),format.raw/*52.25*/("""</div>
                    </div>

                    """),_display_(/*55.22*/if(null == reparation.getService)/*55.55*/ {_display_(Seq[Any](format.raw/*55.57*/("""
                        """),format.raw/*56.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">Modifier une reparation</h3>
                                    <form class="form-horizontal" method="post" action="/demande-travaux/"""),_display_(/*60.107*/reparation/*60.117*/.getId),format.raw/*60.123*/("""/update">
                                        <div class="form-group">
                                            <div class="col-md-6">
                                                <input name="service" type="text" class="form-control" placeholder="Service" required="required">
                                            </div>
                                            <div class="col-md-6">
                                                <select name="affectation" class="form-control">
                                                    <option value="GE">GE</option>
                                                    <option value="GPL">GPL</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-6">
                                                <input name="kilometrageDebut" type="text" class="form-control" placeholder="Kilométrage début">
                                            </div>
                                            <div class="col-md-6">
                                                <input name="kilometrageFin" type="text" class="form-control" placeholder="Kilométrage fin">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-6">
                                                <input name="nomReparateur" type="text" class="form-control" placeholder="Nom réparateur">
                                            </div>
                                            <div class="col-md-6">
                                                <input name="prenomReparateur" type="text" class="form-control" placeholder="Prénom réparateur">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-12">
                                                <textarea name="commentaireControleur" class="form-control" rows="5" placeholder="Commentaire controleur"></textarea>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-md-6">
                                            """),_display_(/*96.46*/if(null == reparation.getDateDemandeTravaux)/*96.90*/ {_display_(Seq[Any](format.raw/*96.92*/("""
                                                """),format.raw/*97.49*/("""<input name="dateDemandeTravaux" type="text"  pattern="[0-9]"""),format.raw/*97.109*/("""{"""),format.raw/*97.110*/("""2"""),format.raw/*97.111*/("""}"""),format.raw/*97.112*/("""-[0-9]"""),format.raw/*97.118*/("""{"""),format.raw/*97.119*/("""2"""),format.raw/*97.120*/("""}"""),format.raw/*97.121*/("""-[0-9]"""),format.raw/*97.127*/("""{"""),format.raw/*97.128*/("""4"""),format.raw/*97.129*/("""}"""),format.raw/*97.130*/(""""  class="form-control" placeholder="Date demande de travaux" required="required">
                                            """)))}/*98.47*/else/*98.52*/{_display_(Seq[Any](format.raw/*98.53*/("""
                                                """),format.raw/*99.49*/("""<input name="dateDemandeTravaux" type="text" pattern="[0-9]"""),format.raw/*99.108*/("""{"""),format.raw/*99.109*/("""2"""),format.raw/*99.110*/("""}"""),format.raw/*99.111*/("""-[0-9]"""),format.raw/*99.117*/("""{"""),format.raw/*99.118*/("""2"""),format.raw/*99.119*/("""}"""),format.raw/*99.120*/("""-[0-9]"""),format.raw/*99.126*/("""{"""),format.raw/*99.127*/("""4"""),format.raw/*99.128*/("""}"""),format.raw/*99.129*/(""""  value=""""),_display_(/*99.140*/reparation/*99.150*/.getDateDemandeTravaux.format("dd-MM-yyyy")),format.raw/*99.193*/("""" class="form-control" placeholder="Date demande de travaux" required="required">
                                                """)))}),format.raw/*100.50*/("""
                                            """),format.raw/*101.45*/("""</div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-md-2">
                                                <input name="id" type="hidden" value=""""),_display_(/*106.88*/reparation/*106.98*/.getId),format.raw/*106.104*/("""">
                                                <input name="numero" type="hidden" value=""""),_display_(/*107.92*/reparation/*107.102*/.getNumero),format.raw/*107.112*/("""">
                                                <button type="submit" class="btn btn-block btn-info">Mettre à jour</button>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    """)))}/*116.23*/else/*116.28*/{_display_(Seq[Any](format.raw/*116.29*/("""
                        """),format.raw/*117.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <dl>
                                        <dt>DATE</dt>
                                        <dd>"""),_display_(/*122.46*/if(null != reparation.getDateDemandeTravaux)/*122.90*/{_display_(Seq[Any](format.raw/*122.91*/("""
                                            """),_display_(/*123.46*/reparation/*123.56*/.getDateDemandeTravaux.format("dd-MM-yyyy")),format.raw/*123.99*/("""
                                        """)))}),format.raw/*124.42*/("""</dd><br>
                                        <dt>SERVICE</dt>
                                        <dd>"""),_display_(/*126.46*/reparation/*126.56*/.getService),format.raw/*126.67*/("""</dd><br>
                                        <dt>AFFECTATION</dt>
                                        <dd>"""),_display_(/*128.46*/reparation/*128.56*/.getAffectation),format.raw/*128.71*/("""</dd><br>
                                        <dt>CAMION</dt>
                                        <dd>"""),_display_(/*130.46*/reparation/*130.56*/.getCamion.getImmatriculation),format.raw/*130.85*/("""</dd><br>
                                        <dt>PROPRIÉTAIRE</dt>
                                        <dd>"""),_display_(/*132.46*/reparation/*132.56*/.getCamion.getProprietaire.getNom),format.raw/*132.89*/("""</dd><br>
                                        <dt>KILOMETRAGE DÉBUT</dt>
                                        <dd>"""),_display_(/*134.46*/reparation/*134.56*/.getKilometrageDebut),format.raw/*134.76*/("""</dd><br>
                                        <dt>KILOMETRAGE FIN</dt>
                                        <dd>"""),_display_(/*136.46*/reparation/*136.56*/.getKilometrageFin),format.raw/*136.74*/("""</dd><br>
                                        <dt>TRANSPORTEUR</dt>
                                        <dd>"""),_display_(/*138.46*/reparation/*138.56*/.getPersonnel.getNom),format.raw/*138.76*/(""" """),_display_(/*138.78*/reparation/*138.88*/.getPersonnel.getPrenom),format.raw/*138.111*/("""</dd>
                                    </dl>
                                    <a href="/demande-travauxs/"""),_display_(/*140.65*/reparation/*140.75*/.getId),format.raw/*140.81*/("""/reference/"""),_display_(/*140.93*/reparation/*140.103*/.getReferenceImpressionDemandeTravaux),format.raw/*140.140*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> Générer </a>
                                    <a href="/rapport/download/Demande-Travaux/"""),_display_(/*141.81*/reparation/*141.91*/.getReferenceImpressionDemandeTravaux),format.raw/*141.128*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> Imprimer</a><br><br>

                                    <a href="/demande-travaux/"""),_display_(/*143.64*/reparation/*143.74*/.getId),format.raw/*143.80*/("""/edit" class="btn btn-info">Modifier</a>
                                    <a href="/bon-reparations/"""),_display_(/*144.64*/reparation/*144.74*/.getId),format.raw/*144.80*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Bon de réparation">
                                        Bon de réparation </a>
                                    <a href="/ordre-paiements/"""),_display_(/*146.64*/reparation/*146.74*/.getId),format.raw/*146.80*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Ordre de paiement">
                                        Ordre de paiement </a>
                                </div>
                            </div>
                            </div>

                    """)))}),format.raw/*152.22*/("""

                    """),format.raw/*154.21*/("""<div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Ajouter un TAF</h3>
                                <form class="form-horizontal" method="post" action="/demande-travaux/"""),_display_(/*158.103*/reparation/*158.113*/.getId),format.raw/*158.119*/("""/tafs">

                                    <div class="form-group">
                                        <div class="col-md-5">
                                            <textarea name="travail" class="form-control" rows="5" placeholder="TAF"></textarea>
                                        </div>

                                        <div class="col-md-5">
                                            <textarea name="observation" class="form-control" rows="5" placeholder="Observation"></textarea>
                                        </div>

                                        <div class="col-md-2">
                                            <input name="reparation.id" type="hidden" value=""""),_display_(/*170.95*/reparation/*170.105*/.getId),format.raw/*170.111*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">TAF</h3>
                                """),_display_(/*184.34*/if(tafs.size() > 0)/*184.53*/ {_display_(Seq[Any](format.raw/*184.55*/("""
                                    """),format.raw/*185.37*/("""<input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>Ordre</th>
                                                    <th>TAF</th>
                                                    <th>Obervation</th>
                                                    <th>Modifier</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*198.46*/for(taf <- tafs) yield /*198.62*/ {_display_(Seq[Any](format.raw/*198.64*/("""
                                                """),format.raw/*199.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*200.58*/{
                                                        i = i + 1;
                                                        i
                                                    }),format.raw/*203.54*/("""</td>
                                                    <td>"""),_display_(/*204.58*/taf/*204.61*/.getTravail),format.raw/*204.72*/("""</td>
                                                    <td>"""),_display_(/*205.58*/taf/*205.61*/.getObservation),format.raw/*205.76*/("""</td>
                                                    <td>
                                                        <a href="/demande-travaux/"""),_display_(/*207.84*/reparation/*207.94*/.getId),format.raw/*207.100*/("""/tafs/"""),_display_(/*207.107*/taf/*207.110*/.getId),format.raw/*207.116*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/demande-travaux/"""),_display_(/*210.84*/reparation/*210.94*/.getId),format.raw/*210.100*/("""/tafs/"""),_display_(/*210.107*/taf/*210.110*/.getId),format.raw/*210.116*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*213.46*/("""
                                            """),format.raw/*214.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                """)))}),format.raw/*218.34*/("""
                            """),format.raw/*219.29*/("""</div>
                        </div>

                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*230.6*/foot()),format.raw/*230.12*/("""

    """),format.raw/*232.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(reparation:Reparation,tafs:util.List[Taf]): play.twirl.api.HtmlFormat.Appendable = apply(reparation,tafs)

  def f:((Reparation,util.List[Taf]) => play.twirl.api.HtmlFormat.Appendable) = (reparation,tafs) => apply(reparation,tafs)

  def ref: this.type = this

}


}
}

/**/
object demande_travaux extends demande_travaux_Scope0.demande_travaux_Scope1.demande_travaux
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/demande_travaux.scala.html
                  HASH: a97cbe18677100f8a3fefa5ee8d6a70572e2c565
                  MATRIX: 839->19|1019->65|1047->108|1075->110|1139->149|1165->155|1195->158|2056->992|2083->998|2126->1013|2593->1453|2632->1483|2672->1485|2733->1518|2978->1736|2992->1741|3026->1754|3087->1787|3154->1823|3211->1853|3252->1885|3292->1887|3353->1920|3598->2138|3612->2143|3648->2158|3715->2194|3768->2219|3851->2275|3893->2308|3933->2310|3986->2335|4339->2660|4359->2670|4387->2676|7082->5344|7135->5388|7175->5390|7252->5439|7341->5499|7371->5500|7401->5501|7431->5502|7466->5508|7496->5509|7526->5510|7556->5511|7591->5517|7621->5518|7651->5519|7681->5520|7828->5649|7841->5654|7880->5655|7957->5704|8045->5763|8075->5764|8105->5765|8135->5766|8170->5772|8200->5773|8230->5774|8260->5775|8295->5781|8325->5782|8355->5783|8385->5784|8424->5795|8444->5805|8509->5848|8672->5979|8746->6024|9048->6298|9068->6308|9097->6314|9219->6408|9240->6418|9273->6428|9689->6825|9703->6830|9743->6831|9797->6856|10091->7122|10145->7166|10185->7167|10259->7213|10279->7223|10344->7266|10418->7308|10558->7420|10578->7430|10611->7441|10755->7557|10775->7567|10812->7582|10951->7693|10971->7703|11022->7732|11167->7849|11187->7859|11242->7892|11392->8014|11412->8024|11454->8044|11602->8164|11622->8174|11662->8192|11807->8309|11827->8319|11869->8339|11899->8341|11919->8351|11965->8374|12105->8486|12125->8496|12153->8502|12193->8514|12214->8524|12274->8561|12521->8780|12541->8790|12601->8827|12847->9045|12867->9055|12895->9061|13027->9165|13047->9175|13075->9181|13327->9405|13347->9415|13375->9421|13699->9713|13750->9735|14079->10035|14100->10045|14129->10051|14876->10770|14897->10780|14926->10786|15536->11368|15565->11387|15606->11389|15672->11426|16661->12387|16694->12403|16735->12405|16813->12454|16918->12531|17120->12711|17211->12774|17224->12777|17257->12788|17348->12851|17361->12854|17398->12869|17572->13015|17592->13025|17621->13031|17657->13038|17671->13041|17700->13047|18047->13366|18067->13376|18096->13382|18132->13389|18146->13392|18175->13398|18554->13745|18628->13790|18965->14095|19023->14124|19357->14431|19385->14437|19419->14443
                  LINES: 30->2|35->2|36->4|37->5|40->8|40->8|43->11|60->28|60->28|63->31|73->41|73->41|73->41|74->42|76->44|76->44|76->44|77->45|78->46|79->47|79->47|79->47|80->48|82->50|82->50|82->50|83->51|84->52|87->55|87->55|87->55|88->56|92->60|92->60|92->60|128->96|128->96|128->96|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|129->97|130->98|130->98|130->98|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|131->99|132->100|133->101|138->106|138->106|138->106|139->107|139->107|139->107|148->116|148->116|148->116|149->117|154->122|154->122|154->122|155->123|155->123|155->123|156->124|158->126|158->126|158->126|160->128|160->128|160->128|162->130|162->130|162->130|164->132|164->132|164->132|166->134|166->134|166->134|168->136|168->136|168->136|170->138|170->138|170->138|170->138|170->138|170->138|172->140|172->140|172->140|172->140|172->140|172->140|173->141|173->141|173->141|175->143|175->143|175->143|176->144|176->144|176->144|178->146|178->146|178->146|184->152|186->154|190->158|190->158|190->158|202->170|202->170|202->170|216->184|216->184|216->184|217->185|230->198|230->198|230->198|231->199|232->200|235->203|236->204|236->204|236->204|237->205|237->205|237->205|239->207|239->207|239->207|239->207|239->207|239->207|242->210|242->210|242->210|242->210|242->210|242->210|245->213|246->214|250->218|251->219|262->230|262->230|264->232
                  -- GENERATED --
              */
          