
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object articles_Scope0 {
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

     object articles_Scope1 {
import java.util

class articles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(articles: util.List[Article]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

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
                                <h3 class="box-title m-b-0">Ajouter un nouvel article</h3>
                                <form class="form-horizontal" method="post" action="/articles">

                                    <div class="form-group">
                                        <div class="col-md-10">
                                            <input name="nom" type="text" class="form-control" placeholder="Désingation" required="required">
                                        </div>

                                        <div class="col-md-2">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*74.22*/if(articles.size() > 0)/*74.45*/ {_display_(Seq[Any](format.raw/*74.47*/("""
                        """),format.raw/*75.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>NOM</th>
                                                    <th>STOCK</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*89.46*/for(article <- articles) yield /*89.70*/ {_display_(Seq[Any](format.raw/*89.72*/("""
                                                """),format.raw/*90.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*91.58*/article/*91.65*/.getNom),format.raw/*91.72*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*92.98*/article/*92.105*/.getStock),format.raw/*92.114*/("""</span></td>
                                                    <td>
                                                        <a href="/articles/"""),_display_(/*94.77*/article/*94.84*/.getId),format.raw/*94.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>

                                                        <a href="/articles/"""),_display_(/*96.77*/article/*96.84*/.getId),format.raw/*96.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*99.46*/("""
                                            """),format.raw/*100.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*107.22*/("""


                """),format.raw/*110.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

        """),_display_(/*116.10*/foot()),format.raw/*116.16*/("""

    """),format.raw/*118.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(articles:util.List[Article]): play.twirl.api.HtmlFormat.Appendable = apply(articles)

  def f:((util.List[Article]) => play.twirl.api.HtmlFormat.Appendable) = (articles) => apply(articles)

  def ref: this.type = this

}


}
}

/**/
object articles extends articles_Scope0.articles_Scope1.articles
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/articles.scala.html
                  HASH: 8d28bc971aacc5c748417df8ee630790b7a2b331
                  MATRIX: 811->19|936->49|964->51|1028->90|1054->96|1086->102|1947->936|1974->942|2017->957|2478->1391|2517->1421|2557->1423|2618->1456|2863->1674|2877->1679|2911->1692|2972->1725|3039->1761|3096->1791|3137->1823|3177->1825|3238->1858|3483->2076|3497->2081|3533->2096|3600->2132|3653->2157|4779->3256|4811->3279|4851->3281|4904->3306|5910->4285|5950->4309|5990->4311|6067->4360|6171->4437|6187->4444|6215->4451|6345->4554|6362->4561|6393->4570|6566->4716|6582->4723|6609->4729|6834->4927|6850->4934|6877->4940|7255->5287|7329->5332|7759->5730|7807->5749|8063->5977|8091->5983|8125->5989
                  LINES: 30->2|35->2|37->4|40->7|40->7|42->9|59->26|59->26|62->29|72->39|72->39|72->39|73->40|75->42|75->42|75->42|76->43|77->44|78->45|78->45|78->45|79->46|81->48|81->48|81->48|82->49|83->50|107->74|107->74|107->74|108->75|122->89|122->89|122->89|123->90|124->91|124->91|124->91|125->92|125->92|125->92|127->94|127->94|127->94|129->96|129->96|129->96|132->99|133->100|140->107|143->110|149->116|149->116|151->118
                  -- GENERATED --
              */
          