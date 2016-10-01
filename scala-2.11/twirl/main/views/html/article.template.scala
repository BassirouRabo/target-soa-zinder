
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object article_Scope0 {
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

     object article_Scope1 {
import java.util

class article extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Article,util.List[EntreeArticle],util.List[SortieArticle],util.List[Camion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(article: Article, entreeArticles: util.List[EntreeArticle], sortieArticles: util.List[SortieArticle], camions : util.List[Camion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.133*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""

    """),format.raw/*9.5*/("""<body class="fix-sidebar">
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
                            <h4 class="page-title">Nos articles</h4>
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
                                <h3 class="box-title m-b-0">Modifier un article</h3>
                                <form class="form-horizontal" method="post" action="/articles/"""),_display_(/*57.96*/article/*57.103*/.getId),format.raw/*57.109*/("""/update">

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" value=""""),_display_(/*61.104*/article/*61.111*/.getNom),format.raw/*61.118*/("""" required="required">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="stock" type="text" class="form-control" value=""""),_display_(/*64.106*/article/*64.113*/.getStock),format.raw/*64.122*/("""" readonly="readonly">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*70.84*/article/*70.91*/.getId),format.raw/*70.97*/("""">
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
                                <h3 class="box-title m-b-0">Nouvelle entrée en stock</h3>
                                <form class="form-horizontal" method="post" action="/articles/"""),_display_(/*84.96*/article/*84.103*/.getId),format.raw/*84.109*/("""/entree-articles/create">

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="provenance" type="text" class="form-control" placeholder="Provenance">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="quantite" type="number" min="0" class="form-control" placeholder="Quantité">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="article.id" type="hidden" value=""""),_display_(/*97.92*/article/*97.99*/.getId),format.raw/*97.105*/("""">
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
                                <h3 class="box-title m-b-0">Nouvelle sortie en stock</h3>
                                <form class="form-horizontal" method="post" action="/articles/"""),_display_(/*111.96*/article/*111.103*/.getId),format.raw/*111.109*/("""/sortie-articles/create">

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="camion.id" class="form-control" >
                                                <option value="-">-</option>
                                                """),_display_(/*117.50*/for(camion <- camions) yield /*117.72*/ {_display_(Seq[Any](format.raw/*117.74*/("""
                                                    """),format.raw/*118.53*/("""<option value=""""),_display_(/*118.69*/camion/*118.75*/.getId),format.raw/*118.81*/("""">"""),_display_(/*118.84*/camion/*118.90*/.getImmatriculation),format.raw/*118.109*/(""" """),format.raw/*118.110*/("""- """),_display_(/*118.113*/camion/*118.119*/.getProprietaire),format.raw/*118.135*/("""</option>
                                                """)))}),format.raw/*119.50*/("""
                                            """),format.raw/*120.45*/("""</select>
                                        </div>
                                        <div class="col-md-3">
                                            <input name="quantite" type="number" min="0" class="form-control" placeholder="Quantité">
                                        </div>
                                        <div class="col-md-3">
                                            <select name="type" class="form-control" >
                                                <option value="Normale">Normale</option>
                                                <option value="Perdu">Perdu</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="article.id" type="hidden" value=""""),_display_(/*135.92*/article/*135.99*/.getId),format.raw/*135.105*/("""">
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
                                <h3 class="box-title m-b-0">Entrées stock</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table-entree" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table-entree sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>Date</th>
                                                <th>Provenance</th>
                                                <th>Quantité</th>
                                                <th>Modifier</th>
                                                <th>Supprimer</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*162.42*/for(entreeArticle <- entreeArticles) yield /*162.78*/ {_display_(Seq[Any](format.raw/*162.80*/("""
                                            """),format.raw/*163.45*/("""<tr class="active">
                                                <td>"""),_display_(/*164.54*/if(null != entreeArticle)/*164.79*/{_display_(Seq[Any](format.raw/*164.80*/("""
                                                    """),_display_(/*165.54*/entreeArticle/*165.67*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*165.100*/("""
                                                """)))}),format.raw/*166.50*/("""</td>
                                                <td>"""),_display_(/*167.54*/entreeArticle/*167.67*/.getProvenance),format.raw/*167.81*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*168.94*/entreeArticle/*168.107*/.getQuantite),format.raw/*168.119*/("""</span></td>
                                                <td>
                                                    <a href="/articles/"""),_display_(/*170.73*/article/*170.80*/.getId),format.raw/*170.86*/("""/entree-articles/"""),_display_(/*170.104*/entreeArticle/*170.117*/.getId),format.raw/*170.123*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                                <td>
                                                    <a href="/articles/"""),_display_(/*173.73*/article/*173.80*/.getId),format.raw/*173.86*/("""/entree-articles/"""),_display_(/*173.104*/entreeArticle/*173.117*/.getId),format.raw/*173.123*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer"  onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*176.42*/("""
                                        """),format.raw/*177.41*/("""</tbody>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Sorties stock</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table-sortie" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table-sortie" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>Date</th>
                                                <th>Camion</th>
                                                <th>Quantité</th>
                                                <th>Type</th>
                                                <th>Modifier</th>
                                                <th>Supprimer</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*203.42*/for(sortieArticle <- sortieArticles) yield /*203.78*/ {_display_(Seq[Any](format.raw/*203.80*/("""
                                            """),format.raw/*204.45*/("""<tr class="active">
                                                <td>"""),_display_(/*205.54*/if(null != sortieArticle)/*205.79*/{_display_(Seq[Any](format.raw/*205.80*/("""
                                                    """),_display_(/*206.54*/sortieArticle/*206.67*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*206.100*/("""
                                                """)))}),format.raw/*207.50*/("""</td>
                                                <td>"""),_display_(/*208.54*/sortieArticle/*208.67*/.getCamion.getImmatriculation),format.raw/*208.96*/("""
                                                    """),format.raw/*209.53*/("""- """),_display_(/*209.56*/sortieArticle/*209.69*/.getCamion.getProprietaire),format.raw/*209.95*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*210.94*/sortieArticle/*210.107*/.getQuantite),format.raw/*210.119*/("""</span></td>
                                                <td>"""),_display_(/*211.54*/sortieArticle/*211.67*/.getType),format.raw/*211.75*/("""</td>
                                                <td>
                                                    <a href="/articles/"""),_display_(/*213.73*/article/*213.80*/.getId),format.raw/*213.86*/("""/sortie-articles/"""),_display_(/*213.104*/sortieArticle/*213.117*/.getId),format.raw/*213.123*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                                <td>
                                                    <a href="/articles/"""),_display_(/*216.73*/article/*216.80*/.getId),format.raw/*216.86*/("""/sortie-articles/"""),_display_(/*216.104*/sortieArticle/*216.117*/.getId),format.raw/*216.123*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer"  onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*219.42*/("""
                                        """),format.raw/*220.41*/("""</tbody>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>
        """),_display_(/*233.10*/foot()),format.raw/*233.16*/("""
    """),format.raw/*234.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(article:Article,entreeArticles:util.List[EntreeArticle],sortieArticles:util.List[SortieArticle],camions:util.List[Camion]): play.twirl.api.HtmlFormat.Appendable = apply(article,entreeArticles,sortieArticles,camions)

  def f:((Article,util.List[EntreeArticle],util.List[SortieArticle],util.List[Camion]) => play.twirl.api.HtmlFormat.Appendable) = (article,entreeArticles,sortieArticles,camions) => apply(article,entreeArticles,sortieArticles,camions)

  def ref: this.type = this

}


}
}

/**/
object article extends article_Scope0.article_Scope1.article
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/article.scala.html
                  HASH: 14932f1dea491fece59f65d7a508aa9ea4dfa65c
                  MATRIX: 865->19|1092->150|1120->152|1184->191|1210->197|1242->203|2103->1037|2130->1043|2173->1058|2634->1492|2673->1522|2713->1524|2774->1557|3019->1775|3033->1780|3067->1793|3128->1826|3195->1862|3252->1892|3293->1924|3333->1926|3394->1959|3639->2177|3653->2182|3689->2197|3756->2233|3809->2258|4189->2611|4206->2618|4234->2624|4500->2862|4517->2869|4546->2876|4812->3114|4829->3121|4860->3130|5208->3451|5224->3458|5251->3464|5944->4130|5961->4137|5989->4143|6845->4972|6861->4979|6889->4985|7582->5650|7600->5657|7629->5663|8026->6032|8065->6054|8106->6056|8188->6109|8232->6125|8248->6131|8276->6137|8307->6140|8323->6146|8365->6165|8396->6166|8428->6169|8445->6175|8484->6191|8575->6250|8649->6295|9662->7280|9679->7287|9708->7293|11254->8811|11307->8847|11348->8849|11422->8894|11523->8967|11558->8992|11598->8993|11680->9047|11703->9060|11759->9093|11841->9143|11928->9202|11951->9215|11987->9229|12114->9328|12138->9341|12173->9353|12339->9491|12356->9498|12384->9504|12431->9522|12455->9535|12484->9541|12812->9841|12829->9848|12857->9854|12904->9872|12928->9885|12957->9891|13325->10227|13395->10268|15002->11847|15055->11883|15096->11885|15170->11930|15271->12003|15306->12028|15346->12029|15428->12083|15451->12096|15507->12129|15589->12179|15676->12238|15699->12251|15750->12280|15832->12333|15863->12336|15886->12349|15934->12375|16061->12474|16085->12487|16120->12499|16214->12565|16237->12578|16267->12586|16426->12717|16443->12724|16471->12730|16518->12748|16542->12761|16571->12767|16899->13067|16916->13074|16944->13080|16991->13098|17015->13111|17044->13117|17412->13453|17482->13494|18107->14091|18135->14097|18168->14102
                  LINES: 30->2|35->2|37->4|40->7|40->7|42->9|59->26|59->26|62->29|72->39|72->39|72->39|73->40|75->42|75->42|75->42|76->43|77->44|78->45|78->45|78->45|79->46|81->48|81->48|81->48|82->49|83->50|90->57|90->57|90->57|94->61|94->61|94->61|97->64|97->64|97->64|103->70|103->70|103->70|117->84|117->84|117->84|130->97|130->97|130->97|144->111|144->111|144->111|150->117|150->117|150->117|151->118|151->118|151->118|151->118|151->118|151->118|151->118|151->118|151->118|151->118|151->118|152->119|153->120|168->135|168->135|168->135|195->162|195->162|195->162|196->163|197->164|197->164|197->164|198->165|198->165|198->165|199->166|200->167|200->167|200->167|201->168|201->168|201->168|203->170|203->170|203->170|203->170|203->170|203->170|206->173|206->173|206->173|206->173|206->173|206->173|209->176|210->177|236->203|236->203|236->203|237->204|238->205|238->205|238->205|239->206|239->206|239->206|240->207|241->208|241->208|241->208|242->209|242->209|242->209|242->209|243->210|243->210|243->210|244->211|244->211|244->211|246->213|246->213|246->213|246->213|246->213|246->213|249->216|249->216|249->216|249->216|249->216|249->216|252->219|253->220|266->233|266->233|267->234
                  -- GENERATED --
              */
          