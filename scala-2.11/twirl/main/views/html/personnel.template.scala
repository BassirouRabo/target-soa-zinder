
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object personnel_Scope0 {
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

     object personnel_Scope1 {
import java.util

class personnel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Personnel,util.List[Salaire],util.List[Salaire],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(personnel: Personnel, salaires: util.List[Salaire], salairesMonth: util.List[Salaire], totalAvance: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.108*/("""

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
                            <h4 class="page-title">Personnel interne</h4>
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
                                <h3 class="box-title m-b-0">Modifier un personnel</h3>
                                <form class="form-horizontal" method="post" action="/personnels/"""),_display_(/*58.98*/personnel/*58.107*/.getId),format.raw/*58.113*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="fonction" required="required" class="form-control">
                                                """),_display_(/*62.50*/if(personnel.getFonction.equals("Administratif"))/*62.99*/ {_display_(Seq[Any](format.raw/*62.101*/("""
                                                    """),format.raw/*63.53*/("""<option value="Administratif" selected="selected">Administratif</option>
                                                """)))}/*64.51*/else/*64.56*/{_display_(Seq[Any](format.raw/*64.57*/("""
                                                    """),format.raw/*65.53*/("""<option value="Administratif">Administratif</option>
                                                """)))}),format.raw/*66.50*/("""

                                                """),_display_(/*68.50*/if(personnel.getFonction.equals("Chauffeur"))/*68.95*/ {_display_(Seq[Any](format.raw/*68.97*/("""
                                                    """),format.raw/*69.53*/("""<option value="Chauffeur" selected="selected">Chauffeur</option>
                                                """)))}/*70.51*/else/*70.56*/{_display_(Seq[Any](format.raw/*70.57*/("""
                                                    """),format.raw/*71.53*/("""<option value="Chauffeur">Chauffeur</option>
                                                """)))}),format.raw/*72.50*/("""
                                            """),format.raw/*73.45*/("""</select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" value=""""),_display_(/*78.104*/personnel/*78.113*/.getNom),format.raw/*78.120*/("""" required="required" placeholder="Nom">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prenom" type="text" class="form-control" value=""""),_display_(/*82.107*/personnel/*82.116*/.getPrenom),format.raw/*82.126*/("""" required="required" placeholder="Prenom">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="telephone" type="text" class="form-control" value=""""),_display_(/*87.110*/personnel/*87.119*/.getTelephone),format.raw/*87.132*/("""" placeholder="Téléphone">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="salaire" type="number" class="form-control" value=""""),_display_(/*91.110*/personnel/*91.119*/.getSalaire),format.raw/*91.130*/("""" placeholder="Salaire">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input type="hidden" value=""""),_display_(/*97.74*/personnel/*97.83*/.getId),format.raw/*97.89*/("""" name="id">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Ajouter une avance sur salaire</h3>
                                <form class="form-horizontal" method="post" action="/salaires">
                                    <div class="form-group">

                                        <div class="col-md-5">
                                            <input name="avance" type="number" min="0" class="form-control" placeholder="Avance" required="required">
                                        </div>

                                        <div class="col-md-5">
                                            <input name="whenDone" type="text" pattern="[0-9]"""),format.raw/*119.94*/("""{"""),format.raw/*119.95*/("""2"""),format.raw/*119.96*/("""}"""),format.raw/*119.97*/("""-[0-9]"""),format.raw/*119.103*/("""{"""),format.raw/*119.104*/("""2"""),format.raw/*119.105*/("""}"""),format.raw/*119.106*/("""-[0-9]"""),format.raw/*119.112*/("""{"""),format.raw/*119.113*/("""4"""),format.raw/*119.114*/("""}"""),format.raw/*119.115*/(""""  class="form-control" placeholder="Date" required="required">
                                        </div>

                                        <div class="col-md-2">
                                            <input type="hidden" name="personnel.id" value=""""),_display_(/*123.94*/personnel/*123.103*/.getId),format.raw/*123.109*/("""">
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
                                <h3 class="box-title m-b-0">AVANCE / SALAIRE DU MOIS</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">

                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>Date</th>
                                                <th>Avance</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*148.42*/for(salaire <- salairesMonth) yield /*148.71*/ {_display_(Seq[Any](format.raw/*148.73*/("""
                                            """),format.raw/*149.45*/("""<tr class="active">
                                                <td>"""),_display_(/*150.54*/if(null != salaire.getWhenDone)/*150.85*/ {_display_(Seq[Any](format.raw/*150.87*/("""
                                                    """),_display_(/*151.54*/salaire/*151.61*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*151.94*/("""
                                                """)))}),format.raw/*152.50*/("""
                                                """),format.raw/*153.49*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*154.94*/salaire/*154.101*/.getAvance),format.raw/*154.111*/("""</span></td>
                                            </tr>
                                        """)))}),format.raw/*156.42*/("""
                                        """),format.raw/*157.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>SALAIRE / MOIS</th>
                                                <th class="text-right"><span class="number">"""),_display_(/*161.94*/if(null != personnel.getSalaire)/*161.126*/ {_display_(Seq[Any](format.raw/*161.128*/("""
                                                    """),_display_(/*162.54*/personnel/*162.63*/.getSalaire),format.raw/*162.74*/("""
                                                """)))}/*163.51*/else/*163.56*/{_display_(Seq[Any](format.raw/*163.57*/("""
                                                    """),format.raw/*164.53*/("""-
                                                """)))}),format.raw/*165.50*/("""</span></th>
                                            </tr>
                                            <tr class="active">
                                                <th>TOTAL AVANCES / SALAIRE</th>
                                                <th class="text-right"><span class="number">"""),_display_(/*169.94*/totalAvance),format.raw/*169.105*/("""</span></th>
                                            </tr>
                                            <tr class="active">
                                                <th>SALAIRE RESTANT</th>
                                                <th class="text-right"><span class="number">"""),_display_(/*173.94*/if(null != personnel.getSalaire && personnel.getSalaire >= 0)/*173.155*/{_display_(Seq[Any](format.raw/*173.156*/("""
                                                    """),_display_(/*174.54*/(personnel.getSalaire - totalAvance)),format.raw/*174.90*/("""
                                                """)))}/*175.51*/else/*175.56*/{_display_(Seq[Any](format.raw/*175.57*/("""
                                                    """),format.raw/*176.53*/("""-
                                                """)))}),format.raw/*177.50*/("""</span></th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*187.22*/if(salaires.size() > 0 )/*187.46*/ {_display_(Seq[Any](format.raw/*187.48*/("""
                        """),format.raw/*188.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">AVANCE / SALAIRE GLOBALE</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">

                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable">
                                            <thead>
                                                <tr class="active">
                                                    <th>Date</th>
                                                    <th>Avance</th>
                                                    <th>Détail</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*205.46*/for(salaire <- salaires) yield /*205.70*/ {_display_(Seq[Any](format.raw/*205.72*/("""
                                                """),format.raw/*206.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*207.58*/if(null != salaire.getWhenDone)/*207.89*/ {_display_(Seq[Any](format.raw/*207.91*/("""
                                                        """),_display_(/*208.58*/salaire/*208.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*208.98*/("""
                                                    """)))}),format.raw/*209.54*/("""
                                                    """),format.raw/*210.53*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*211.98*/salaire/*211.105*/.getAvance),format.raw/*211.115*/("""</span></td>
                                                    <td>
                                                        <a href="/salaires/"""),_display_(/*213.77*/salaire/*213.84*/.getId),format.raw/*213.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/salaires/"""),_display_(/*216.77*/salaire/*216.84*/.getId),format.raw/*216.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*219.46*/("""
                                            """),format.raw/*220.45*/("""</tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*226.22*/("""

                """),format.raw/*228.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*234.6*/foot()),format.raw/*234.12*/("""

    """),format.raw/*236.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(personnel:Personnel,salaires:util.List[Salaire],salairesMonth:util.List[Salaire],totalAvance:Long): play.twirl.api.HtmlFormat.Appendable = apply(personnel,salaires,salairesMonth,totalAvance)

  def f:((Personnel,util.List[Salaire],util.List[Salaire],Long) => play.twirl.api.HtmlFormat.Appendable) = (personnel,salaires,salairesMonth,totalAvance) => apply(personnel,salaires,salairesMonth,totalAvance)

  def ref: this.type = this

}


}
}

/**/
object personnel extends personnel_Scope0.personnel_Scope1.personnel
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:15 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/personnel.scala.html
                  HASH: b693a53e1fa1ef431cbc3694e2d868558ebadf68
                  MATRIX: 848->19|1050->125|1078->127|1142->166|1168->172|1198->175|2059->1009|2086->1015|2129->1030|2595->1469|2634->1499|2674->1501|2735->1534|2980->1752|2994->1757|3028->1770|3089->1803|3156->1839|3213->1869|3254->1901|3294->1903|3355->1936|3600->2154|3614->2159|3650->2174|3717->2210|3770->2235|4154->2592|4173->2601|4201->2607|4521->2900|4579->2949|4620->2951|4701->3004|4842->3127|4855->3132|4894->3133|4975->3186|5108->3288|5186->3339|5240->3384|5280->3386|5361->3439|5494->3554|5507->3559|5546->3560|5627->3613|5752->3707|5825->3752|6180->4079|6199->4088|6228->4095|6514->4353|6533->4362|6565->4372|6960->4739|6979->4748|7014->4761|7289->5008|7308->5017|7341->5028|7681->5341|7699->5350|7726->5356|8917->6518|8947->6519|8977->6520|9007->6521|9043->6527|9074->6528|9105->6529|9136->6530|9172->6536|9203->6537|9234->6538|9265->6539|9561->6807|9581->6816|9610->6822|10951->8135|10997->8164|11038->8166|11112->8211|11213->8284|11254->8315|11295->8317|11377->8371|11394->8378|11449->8411|11531->8461|11609->8510|11736->8609|11754->8616|11787->8626|11923->8730|11993->8771|12307->9057|12350->9089|12392->9091|12474->9145|12493->9154|12526->9165|12596->9216|12610->9221|12650->9222|12732->9275|12815->9326|13144->9627|13178->9638|13499->9931|13571->9992|13612->9993|13694->10047|13752->10083|13822->10134|13836->10139|13876->10140|13958->10193|14041->10244|14547->10722|14581->10746|14622->10748|14676->10773|15834->11903|15875->11927|15916->11929|15994->11978|16099->12055|16140->12086|16181->12088|16267->12146|16284->12153|16339->12186|16425->12240|16507->12293|16638->12396|16656->12403|16689->12413|16863->12559|16880->12566|16908->12572|17248->12884|17265->12891|17293->12897|17672->13244|17746->13289|18005->13516|18052->13534|18303->13758|18331->13764|18365->13770
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|95->62|95->62|95->62|96->63|97->64|97->64|97->64|98->65|99->66|101->68|101->68|101->68|102->69|103->70|103->70|103->70|104->71|105->72|106->73|111->78|111->78|111->78|115->82|115->82|115->82|120->87|120->87|120->87|124->91|124->91|124->91|130->97|130->97|130->97|152->119|152->119|152->119|152->119|152->119|152->119|152->119|152->119|152->119|152->119|152->119|152->119|156->123|156->123|156->123|181->148|181->148|181->148|182->149|183->150|183->150|183->150|184->151|184->151|184->151|185->152|186->153|187->154|187->154|187->154|189->156|190->157|194->161|194->161|194->161|195->162|195->162|195->162|196->163|196->163|196->163|197->164|198->165|202->169|202->169|206->173|206->173|206->173|207->174|207->174|208->175|208->175|208->175|209->176|210->177|220->187|220->187|220->187|221->188|238->205|238->205|238->205|239->206|240->207|240->207|240->207|241->208|241->208|241->208|242->209|243->210|244->211|244->211|244->211|246->213|246->213|246->213|249->216|249->216|249->216|252->219|253->220|259->226|261->228|267->234|267->234|269->236
                  -- GENERATED --
              */
          