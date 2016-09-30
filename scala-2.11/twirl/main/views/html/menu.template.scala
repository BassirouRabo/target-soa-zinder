
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object menu_Scope0 {
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

class menu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse slimscrollsidebar">

        <ul class="nav" id="side-menu">

            <li> <a href="/" class="waves-effect"> <span class="hide-menu">
                           Accueil </span></a></li>
            <li> <a href="/utilisateurs" class="waves-effect"> <span class="hide-menu">
                            Utilisateurs </span></a></li>
            <li> <a href="/deconnexion" class="waves-effect"> <span class="hide-menu">
                            Deconnexion </span></a></li>

            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">TIT - Facture<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">
                    <li> <a href="/facture-ventes" class="waves-effect"> <span class="hide-menu">
                           Facture </span></a></li>
                    <li> <a href="/client-ventes" class="waves-effect"> <span class="hide-menu">
                            Client </span></a></li>
                    <li> <a href="/paiement-ventes" class="waves-effect"> <span class="hide-menu">
                            Paiement </span></a></li>
                    <li> <a href="/commande-ventes" class="waves-effect"> <span class="hide-menu">
                            Commande </span></a></li>
                </ul>
            </li>

            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">SOA - Facture<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">
                    <li> <a href="/facture-transports" class="waves-effect"> <span class="hide-menu">Facture </span></a></li>
                    <li> <a href="/client-transports" class="waves-effect"> <span class="hide-menu">Client</span></a></li>
                    <li> <a href="/paiement-transports" class="waves-effect"> <span class="hide-menu">Paiement </span></a></li>
                    <li> <a href="/commande-transports" class="waves-effect"> <span class="hide-menu">Commande </span></a></li>

                </ul>
            </li>


            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">SOA - Réparations<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">

                    <li> <a href="/bon-reparations" class="waves-effect"> <span class="hide-menu">
                            Bon de réparation</span></a></li>

                    <li> <a href="/demande-travaux" class="waves-effect"> <span class="hide-menu">
                            Demande travaux</span></a></li>

                    <li> <a href="/ordre-paiements" class="waves-effect"> <span class="hide-menu">
                            Ordre de paiement</span></a></li>

                </ul>
            </li>

            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">SOA - Transport<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">

                    <li> <a href="/depenses" class="waves-effect"> <span class="hide-menu">
                            Dépense administrative</span></a></li>
                    <li> <a href="/camions" class="waves-effect"> <span class="hide-menu">
                            Camion</span></a></li>
                    <li> <a href="/proprietaires" class="waves-effect"> <span class="hide-menu">
                            Proprietaires</span></a></li>
                </ul>
            </li>

            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">SOA - Produits<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">

                    <li> <a href="/articles" class="waves-effect"> <span class="hide-menu">
                            Article</span></a></li>
                    <li> <a href="/produits" class="waves-effect"> <span class="hide-menu">
                            Hydrocarbure</span></a></li>

                </ul>
            </li>


            <li> <a href="javascript:void(0)" class="waves-effect"><i data-icon="F" class="linea-icon linea-software fa-fw"></i> <span class="hide-menu">SOA - Personnel<span class="fa arrow"></span></span></a>
                <ul class="nav nav-second-level">

                    <li> <a href="/personnels" class="waves-effect"><span class="hide-menu">
                            Personnel</span></a></li>
                    <li> <a href="/salaires" class="waves-effect"> <span class="hide-menu">
                            Avance/Salaire</span></a></li>
                </ul>
            </li>


        </ul>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object menu extends menu_Scope0.menu
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/menu.scala.html
                  HASH: 197fe0e3ef240d70609396e55cc23c14e6ce90fd
                  MATRIX: 825->0
                  LINES: 32->1
                  -- GENERATED --
              */
          