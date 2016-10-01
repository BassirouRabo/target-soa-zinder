
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/hydrocarbure-transport/conf/routes
// @DATE:Fri Sep 30 22:58:12 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_5: controllers.HomeController,
  // @LINE:12
  ArticleController_10: controllers.ArticleController,
  // @LINE:19
  EntreeArticleController_0: controllers.EntreeArticleController,
  // @LINE:25
  SortieArticleController_9: controllers.SortieArticleController,
  // @LINE:31
  BonReparationController_2: controllers.BonReparationController,
  // @LINE:39
  DemandeTravauxController_16: controllers.DemandeTravauxController,
  // @LINE:48
  TafController_23: controllers.TafController,
  // @LINE:55
  OrdrePaiementController_20: controllers.OrdrePaiementController,
  // @LINE:66
  ClientTransportController_14: controllers.ClientTransportController,
  // @LINE:73
  ClientVenteController_3: controllers.ClientVenteController,
  // @LINE:80
  FactureVenteController_18: controllers.FactureVenteController,
  // @LINE:91
  FactureTransportController_13: controllers.FactureTransportController,
  // @LINE:105
  CommandeVenteController_11: controllers.CommandeVenteController,
  // @LINE:112
  CommandeTransportController_21: controllers.CommandeTransportController,
  // @LINE:119
  PaiementVenteController_19: controllers.PaiementVenteController,
  // @LINE:127
  PaiementTransportController_1: controllers.PaiementTransportController,
  // @LINE:135
  CamionController_8: controllers.CamionController,
  // @LINE:142
  DepenseController_15: controllers.DepenseController,
  // @LINE:149
  PersonnelController_4: controllers.PersonnelController,
  // @LINE:156
  ProduitController_7: controllers.ProduitController,
  // @LINE:163
  ProprietaireController_6: controllers.ProprietaireController,
  // @LINE:170
  SalaireController_24: controllers.SalaireController,
  // @LINE:177
  UtilisateurController_17: controllers.UtilisateurController,
  // @LINE:184
  RapportController_12: controllers.RapportController,
  // @LINE:187
  Assets_22: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_5: controllers.HomeController,
    // @LINE:12
    ArticleController_10: controllers.ArticleController,
    // @LINE:19
    EntreeArticleController_0: controllers.EntreeArticleController,
    // @LINE:25
    SortieArticleController_9: controllers.SortieArticleController,
    // @LINE:31
    BonReparationController_2: controllers.BonReparationController,
    // @LINE:39
    DemandeTravauxController_16: controllers.DemandeTravauxController,
    // @LINE:48
    TafController_23: controllers.TafController,
    // @LINE:55
    OrdrePaiementController_20: controllers.OrdrePaiementController,
    // @LINE:66
    ClientTransportController_14: controllers.ClientTransportController,
    // @LINE:73
    ClientVenteController_3: controllers.ClientVenteController,
    // @LINE:80
    FactureVenteController_18: controllers.FactureVenteController,
    // @LINE:91
    FactureTransportController_13: controllers.FactureTransportController,
    // @LINE:105
    CommandeVenteController_11: controllers.CommandeVenteController,
    // @LINE:112
    CommandeTransportController_21: controllers.CommandeTransportController,
    // @LINE:119
    PaiementVenteController_19: controllers.PaiementVenteController,
    // @LINE:127
    PaiementTransportController_1: controllers.PaiementTransportController,
    // @LINE:135
    CamionController_8: controllers.CamionController,
    // @LINE:142
    DepenseController_15: controllers.DepenseController,
    // @LINE:149
    PersonnelController_4: controllers.PersonnelController,
    // @LINE:156
    ProduitController_7: controllers.ProduitController,
    // @LINE:163
    ProprietaireController_6: controllers.ProprietaireController,
    // @LINE:170
    SalaireController_24: controllers.SalaireController,
    // @LINE:177
    UtilisateurController_17: controllers.UtilisateurController,
    // @LINE:184
    RapportController_12: controllers.RapportController,
    // @LINE:187
    Assets_22: controllers.Assets
  ) = this(errorHandler, HomeController_5, ArticleController_10, EntreeArticleController_0, SortieArticleController_9, BonReparationController_2, DemandeTravauxController_16, TafController_23, OrdrePaiementController_20, ClientTransportController_14, ClientVenteController_3, FactureVenteController_18, FactureTransportController_13, CommandeVenteController_11, CommandeTransportController_21, PaiementVenteController_19, PaiementTransportController_1, CamionController_8, DepenseController_15, PersonnelController_4, ProduitController_7, ProprietaireController_6, SalaireController_24, UtilisateurController_17, RapportController_12, Assets_22, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, ArticleController_10, EntreeArticleController_0, SortieArticleController_9, BonReparationController_2, DemandeTravauxController_16, TafController_23, OrdrePaiementController_20, ClientTransportController_14, ClientVenteController_3, FactureVenteController_18, FactureTransportController_13, CommandeVenteController_11, CommandeTransportController_21, PaiementVenteController_19, PaiementTransportController_1, CamionController_8, DepenseController_15, PersonnelController_4, ProduitController_7, ProprietaireController_6, SalaireController_24, UtilisateurController_17, RapportController_12, Assets_22, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """connexion""", """controllers.HomeController.connexion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deconnexion""", """controllers.HomeController.deconnexion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inscription""", """controllers.HomeController.inscription()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """connexion""", """controllers.HomeController.authentification()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error-client""", """controllers.HomeController.errorClient()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error-server""", """controllers.HomeController.errorServer(message:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles""", """controllers.ArticleController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles""", """controllers.ArticleController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>""", """controllers.ArticleController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>/update""", """controllers.ArticleController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>/delete""", """controllers.ArticleController.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/create""", """controllers.EntreeArticleController.create(idArticle:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>""", """controllers.EntreeArticleController.read(idArticle:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>/update""", """controllers.EntreeArticleController.update(idArticle:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>/delete""", """controllers.EntreeArticleController.delete(idArticle:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/create""", """controllers.SortieArticleController.create(idArticle:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>""", """controllers.SortieArticleController.read(idArticle:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>/update""", """controllers.SortieArticleController.update(idArticle:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>/delete""", """controllers.SortieArticleController.delete(idArticle:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations""", """controllers.BonReparationController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations""", """controllers.BonReparationController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations/""" + "$" + """id<[^/]+>""", """controllers.BonReparationController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations/""" + "$" + """id<[^/]+>/update""", """controllers.BonReparationController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations/""" + "$" + """id<[^/]+>/delete""", """controllers.BonReparationController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bon-reparations/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionBonReparation<[^/]+>/generate""", """controllers.BonReparationController.generateBonReparation(id:Long, referenceImpressionBonReparation:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux""", """controllers.DemandeTravauxController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux""", """controllers.DemandeTravauxController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """id<[^/]+>""", """controllers.DemandeTravauxController.read(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """id<[^/]+>/edit""", """controllers.DemandeTravauxController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """id<[^/]+>/update""", """controllers.DemandeTravauxController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """id<[^/]+>/delete""", """controllers.DemandeTravauxController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travauxs/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionDemandeTravaux<[^/]+>/generate""", """controllers.DemandeTravauxController.generateDemandeTravaux(id:Long, referenceImpressionDemandeTravaux:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs""", """controllers.TafController.readsByReparation(idParent:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs""", """controllers.TafController.create(idParent:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>""", """controllers.TafController.read(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/update""", """controllers.TafController.update(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/delete""", """controllers.TafController.delete(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements""", """controllers.OrdrePaiementController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements""", """controllers.OrdrePaiementController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """id<[^/]+>""", """controllers.OrdrePaiementController.read(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """id<[^/]+>/edit""", """controllers.OrdrePaiementController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """id<[^/]+>/update""", """controllers.OrdrePaiementController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """id<[^/]+>/delete""", """controllers.OrdrePaiementController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>""", """controllers.TafController.read2(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/update""", """controllers.TafController.update2(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ordre-paiements/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionOrdrePaiement<[^/]+>/generate""", """controllers.OrdrePaiementController.generateOrdrePaiement(id:Long, referenceImpressionOrdrePaiement:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-transports""", """controllers.ClientTransportController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-transports""", """controllers.ClientTransportController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-transports/""" + "$" + """id<[^/]+>""", """controllers.ClientTransportController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-transports/""" + "$" + """id<[^/]+>/update""", """controllers.ClientTransportController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-transports/""" + "$" + """id<[^/]+>/delete""", """controllers.ClientTransportController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-ventes""", """controllers.ClientVenteController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-ventes""", """controllers.ClientVenteController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-ventes/""" + "$" + """id<[^/]+>""", """controllers.ClientVenteController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-ventes/""" + "$" + """id<[^/]+>/update""", """controllers.ClientVenteController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-ventes/""" + "$" + """id<[^/]+>/delete""", """controllers.ClientVenteController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes""", """controllers.FactureVenteController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes""", """controllers.FactureVenteController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>""", """controllers.FactureVenteController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>/update""", """controllers.FactureVenteController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>/delete""", """controllers.FactureVenteController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>/edit""", """controllers.FactureVenteController.edit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureVente<[^/]+>/generate/proforma""", """controllers.FactureVenteController.generateProforma(id:Long, referenceImpressionFactureVente:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureVente<[^/]+>/generate/definitive""", """controllers.FactureVenteController.generateDefinitive(id:Long, referenceImpressionFactureVente:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports""", """controllers.FactureTransportController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports""", """controllers.FactureTransportController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>""", """controllers.FactureTransportController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/update""", """controllers.FactureTransportController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/delete""", """controllers.FactureTransportController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/edit""", """controllers.FactureTransportController.edit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/proforma""", """controllers.FactureTransportController.generateProforma(id:Long, referenceImpressionFactureTransport:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/definitive""", """controllers.FactureTransportController.generateDefinitive(id:Long, referenceImpressionFactureTransport:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/proforma-sonidep""", """controllers.FactureTransportController.generateProformaSonidep(id:Long, referenceImpressionFactureTransport:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/definitive-sonidep""", """controllers.FactureTransportController.generateDefinitiveSonidep(id:Long, referenceImpressionFactureTransport:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """commande-ventes""", """controllers.CommandeVenteController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes""", """controllers.CommandeVenteController.create(idParent:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>""", """controllers.CommandeVenteController.read(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/update""", """controllers.CommandeVenteController.update(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/delete""", """controllers.CommandeVenteController.delete(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """commande-transports""", """controllers.CommandeTransportController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes""", """controllers.CommandeTransportController.create(idParent:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>""", """controllers.CommandeTransportController.read(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/update""", """controllers.CommandeTransportController.update(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/delete""", """controllers.CommandeTransportController.delete(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiement-ventes""", """controllers.PaiementVenteController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements""", """controllers.PaiementVenteController.create(idParent:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>""", """controllers.PaiementVenteController.read(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/traiter""", """controllers.PaiementVenteController.traiter(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/update""", """controllers.PaiementVenteController.update(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/delete""", """controllers.PaiementVenteController.delete(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiement-transports""", """controllers.PaiementTransportController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements""", """controllers.PaiementTransportController.create(idParent:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>""", """controllers.PaiementTransportController.read(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/traiter""", """controllers.PaiementTransportController.traiter(idParent:Long, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/update""", """controllers.PaiementTransportController.update(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/delete""", """controllers.PaiementTransportController.delete(idParent:Long, id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """camions""", """controllers.CamionController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """camions""", """controllers.CamionController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """camions/""" + "$" + """id<[^/]+>""", """controllers.CamionController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """camions/""" + "$" + """id<[^/]+>/update""", """controllers.CamionController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """camions/""" + "$" + """id<[^/]+>/delete""", """controllers.CamionController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """depenses""", """controllers.DepenseController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """depenses""", """controllers.DepenseController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """depenses/""" + "$" + """id<[^/]+>""", """controllers.DepenseController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """depenses/""" + "$" + """id<[^/]+>/update""", """controllers.DepenseController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """depenses/""" + "$" + """id<[^/]+>/delete""", """controllers.DepenseController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personnels""", """controllers.PersonnelController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personnels""", """controllers.PersonnelController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personnels/""" + "$" + """id<[^/]+>""", """controllers.PersonnelController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personnels/""" + "$" + """id<[^/]+>/update""", """controllers.PersonnelController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """personnels/""" + "$" + """id<[^/]+>/delete""", """controllers.PersonnelController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produits""", """controllers.ProduitController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produits""", """controllers.ProduitController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produits/""" + "$" + """id<[^/]+>""", """controllers.ProduitController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produits/""" + "$" + """id<[^/]+>/update""", """controllers.ProduitController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produits/""" + "$" + """id<[^/]+>/delete""", """controllers.ProduitController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proprietaires""", """controllers.ProprietaireController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proprietaires""", """controllers.ProprietaireController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proprietaires/""" + "$" + """id<[^/]+>""", """controllers.ProprietaireController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proprietaires/""" + "$" + """id<[^/]+>/update""", """controllers.ProprietaireController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proprietaires/""" + "$" + """id<[^/]+>/delete""", """controllers.ProprietaireController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salaires""", """controllers.SalaireController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salaires""", """controllers.SalaireController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salaires/""" + "$" + """id<[^/]+>""", """controllers.SalaireController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salaires/""" + "$" + """id<[^/]+>/update""", """controllers.SalaireController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salaires/""" + "$" + """id<[^/]+>/delete""", """controllers.SalaireController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """utilisateurs""", """controllers.UtilisateurController.reads()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """utilisateurs""", """controllers.UtilisateurController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """utilisateurs/""" + "$" + """id<[^/]+>""", """controllers.UtilisateurController.read(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """utilisateurs/""" + "$" + """id<[^/]+>/update""", """controllers.UtilisateurController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """utilisateurs/""" + "$" + """id<[^/]+>/delete""", """controllers.UtilisateurController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rapport/download/""" + "$" + """folder<[^/]+>/""" + "$" + """reference<[^/]+>""", """controllers.RapportController.download(folder:String, reference:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ Home""",
      this.prefix + """"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_HomeController_connexion1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("connexion")))
  )
  private[this] lazy val controllers_HomeController_connexion1_invoker = createInvoker(
    HomeController_5.connexion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "connexion",
      Nil,
      "GET",
      """""",
      this.prefix + """connexion"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_HomeController_deconnexion2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deconnexion")))
  )
  private[this] lazy val controllers_HomeController_deconnexion2_invoker = createInvoker(
    HomeController_5.deconnexion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deconnexion",
      Nil,
      "GET",
      """""",
      this.prefix + """deconnexion"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_HomeController_inscription3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inscription")))
  )
  private[this] lazy val controllers_HomeController_inscription3_invoker = createInvoker(
    HomeController_5.inscription(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "inscription",
      Nil,
      "GET",
      """""",
      this.prefix + """inscription"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_authentification4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("connexion")))
  )
  private[this] lazy val controllers_HomeController_authentification4_invoker = createInvoker(
    HomeController_5.authentification(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "authentification",
      Nil,
      "POST",
      """""",
      this.prefix + """connexion"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_errorClient5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error-client")))
  )
  private[this] lazy val controllers_HomeController_errorClient5_invoker = createInvoker(
    HomeController_5.errorClient(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "errorClient",
      Nil,
      "GET",
      """""",
      this.prefix + """error-client"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_errorServer6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error-server")))
  )
  private[this] lazy val controllers_HomeController_errorServer6_invoker = createInvoker(
    HomeController_5.errorServer(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "errorServer",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """error-server"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ArticleController_reads7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles")))
  )
  private[this] lazy val controllers_ArticleController_reads7_invoker = createInvoker(
    ArticleController_10.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "reads",
      Nil,
      "GET",
      """ Article""",
      this.prefix + """articles"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ArticleController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles")))
  )
  private[this] lazy val controllers_ArticleController_create8_invoker = createInvoker(
    ArticleController_10.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """articles"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ArticleController_read9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArticleController_read9_invoker = createInvoker(
    ArticleController_10.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ArticleController_update10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_ArticleController_update10_invoker = createInvoker(
    ArticleController_10.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ArticleController_delete11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ArticleController_delete11_invoker = createInvoker(
    ArticleController_10.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_EntreeArticleController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/entree-articles/create")))
  )
  private[this] lazy val controllers_EntreeArticleController_create12_invoker = createInvoker(
    EntreeArticleController_0.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntreeArticleController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """ Entree Article""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/create"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EntreeArticleController_read13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/entree-articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EntreeArticleController_read13_invoker = createInvoker(
    EntreeArticleController_0.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntreeArticleController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_EntreeArticleController_update14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/entree-articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_EntreeArticleController_update14_invoker = createInvoker(
    EntreeArticleController_0.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntreeArticleController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EntreeArticleController_delete15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/entree-articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_EntreeArticleController_delete15_invoker = createInvoker(
    EntreeArticleController_0.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EntreeArticleController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/entree-articles/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SortieArticleController_create16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/sortie-articles/create")))
  )
  private[this] lazy val controllers_SortieArticleController_create16_invoker = createInvoker(
    SortieArticleController_9.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SortieArticleController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """ Sortie Article""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/create"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SortieArticleController_read17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/sortie-articles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SortieArticleController_read17_invoker = createInvoker(
    SortieArticleController_9.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SortieArticleController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SortieArticleController_update18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/sortie-articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_SortieArticleController_update18_invoker = createInvoker(
    SortieArticleController_9.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SortieArticleController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SortieArticleController_delete19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("idArticle", """[^/]+""",true), StaticPart("/sortie-articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_SortieArticleController_delete19_invoker = createInvoker(
    SortieArticleController_9.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SortieArticleController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """idArticle<[^/]+>/sortie-articles/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_BonReparationController_reads20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations")))
  )
  private[this] lazy val controllers_BonReparationController_reads20_invoker = createInvoker(
    BonReparationController_2.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "reads",
      Nil,
      "GET",
      """ BonReparation""",
      this.prefix + """bon-reparations"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BonReparationController_create21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations")))
  )
  private[this] lazy val controllers_BonReparationController_create21_invoker = createInvoker(
    BonReparationController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """bon-reparations"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BonReparationController_read22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BonReparationController_read22_invoker = createInvoker(
    BonReparationController_2.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """bon-reparations/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_BonReparationController_update23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_BonReparationController_update23_invoker = createInvoker(
    BonReparationController_2.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """bon-reparations/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BonReparationController_delete24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_BonReparationController_delete24_invoker = createInvoker(
    BonReparationController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """bon-reparations/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_BonReparationController_generateBonReparation25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bon-reparations/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionBonReparation", """[^/]+""",true), StaticPart("/generate")))
  )
  private[this] lazy val controllers_BonReparationController_generateBonReparation25_invoker = createInvoker(
    BonReparationController_2.generateBonReparation(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BonReparationController",
      "generateBonReparation",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """bon-reparations/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionBonReparation<[^/]+>/generate"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_DemandeTravauxController_reads26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux")))
  )
  private[this] lazy val controllers_DemandeTravauxController_reads26_invoker = createInvoker(
    DemandeTravauxController_16.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "reads",
      Nil,
      "GET",
      """ DemandeTravaux""",
      this.prefix + """demande-travaux"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_DemandeTravauxController_create27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux")))
  )
  private[this] lazy val controllers_DemandeTravauxController_create27_invoker = createInvoker(
    DemandeTravauxController_16.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """demande-travaux"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_DemandeTravauxController_read28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DemandeTravauxController_read28_invoker = createInvoker(
    DemandeTravauxController_16.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_DemandeTravauxController_edit29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_DemandeTravauxController_edit29_invoker = createInvoker(
    DemandeTravauxController_16.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """id<[^/]+>/edit"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_DemandeTravauxController_update30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_DemandeTravauxController_update30_invoker = createInvoker(
    DemandeTravauxController_16.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_DemandeTravauxController_delete31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_DemandeTravauxController_delete31_invoker = createInvoker(
    DemandeTravauxController_16.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_DemandeTravauxController_generateDemandeTravaux32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travauxs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionDemandeTravaux", """[^/]+""",true), StaticPart("/generate")))
  )
  private[this] lazy val controllers_DemandeTravauxController_generateDemandeTravaux32_invoker = createInvoker(
    DemandeTravauxController_16.generateDemandeTravaux(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemandeTravauxController",
      "generateDemandeTravaux",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """demande-travauxs/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionDemandeTravaux<[^/]+>/generate"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_TafController_readsByReparation33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs")))
  )
  private[this] lazy val controllers_TafController_readsByReparation33_invoker = createInvoker(
    TafController_23.readsByReparation(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "readsByReparation",
      Seq(classOf[Long]),
      "GET",
      """ TAF""",
      this.prefix + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TafController_create34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs")))
  )
  private[this] lazy val controllers_TafController_create34_invoker = createInvoker(
    TafController_23.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_TafController_read35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TafController_read35_invoker = createInvoker(
    TafController_23.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_TafController_update36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_TafController_update36_invoker = createInvoker(
    TafController_23.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_TafController_delete37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demande-travaux/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_TafController_delete37_invoker = createInvoker(
    TafController_23.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """demande-travaux/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_OrdrePaiementController_reads38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements")))
  )
  private[this] lazy val controllers_OrdrePaiementController_reads38_invoker = createInvoker(
    OrdrePaiementController_20.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "reads",
      Nil,
      "GET",
      """ OrdrePaiement""",
      this.prefix + """ordre-paiements"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_OrdrePaiementController_create39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements")))
  )
  private[this] lazy val controllers_OrdrePaiementController_create39_invoker = createInvoker(
    OrdrePaiementController_20.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """ordre-paiements"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_OrdrePaiementController_read40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrdrePaiementController_read40_invoker = createInvoker(
    OrdrePaiementController_20.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_OrdrePaiementController_edit41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_OrdrePaiementController_edit41_invoker = createInvoker(
    OrdrePaiementController_20.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """id<[^/]+>/edit"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_OrdrePaiementController_update42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_OrdrePaiementController_update42_invoker = createInvoker(
    OrdrePaiementController_20.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_OrdrePaiementController_delete43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_OrdrePaiementController_delete43_invoker = createInvoker(
    OrdrePaiementController_20.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_TafController_read244_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TafController_read244_invoker = createInvoker(
    TafController_23.read2(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "read2",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_TafController_update245_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/tafs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_TafController_update245_invoker = createInvoker(
    TafController_23.update2(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TafController",
      "update2",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """idParent<[^/]+>/tafs/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_OrdrePaiementController_generateOrdrePaiement46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ordre-paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionOrdrePaiement", """[^/]+""",true), StaticPart("/generate")))
  )
  private[this] lazy val controllers_OrdrePaiementController_generateOrdrePaiement46_invoker = createInvoker(
    OrdrePaiementController_20.generateOrdrePaiement(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdrePaiementController",
      "generateOrdrePaiement",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """ordre-paiements/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionOrdrePaiement<[^/]+>/generate"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ClientTransportController_reads47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-transports")))
  )
  private[this] lazy val controllers_ClientTransportController_reads47_invoker = createInvoker(
    ClientTransportController_14.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientTransportController",
      "reads",
      Nil,
      "GET",
      """ Client Transport""",
      this.prefix + """client-transports"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ClientTransportController_create48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-transports")))
  )
  private[this] lazy val controllers_ClientTransportController_create48_invoker = createInvoker(
    ClientTransportController_14.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientTransportController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """client-transports"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ClientTransportController_read49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-transports/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientTransportController_read49_invoker = createInvoker(
    ClientTransportController_14.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientTransportController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """client-transports/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ClientTransportController_update50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_ClientTransportController_update50_invoker = createInvoker(
    ClientTransportController_14.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientTransportController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """client-transports/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_ClientTransportController_delete51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ClientTransportController_delete51_invoker = createInvoker(
    ClientTransportController_14.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientTransportController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """client-transports/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_ClientVenteController_reads52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-ventes")))
  )
  private[this] lazy val controllers_ClientVenteController_reads52_invoker = createInvoker(
    ClientVenteController_3.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientVenteController",
      "reads",
      Nil,
      "GET",
      """ Client Vente""",
      this.prefix + """client-ventes"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_ClientVenteController_create53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-ventes")))
  )
  private[this] lazy val controllers_ClientVenteController_create53_invoker = createInvoker(
    ClientVenteController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientVenteController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """client-ventes"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_ClientVenteController_read54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-ventes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientVenteController_read54_invoker = createInvoker(
    ClientVenteController_3.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientVenteController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """client-ventes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_ClientVenteController_update55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_ClientVenteController_update55_invoker = createInvoker(
    ClientVenteController_3.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientVenteController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """client-ventes/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_ClientVenteController_delete56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ClientVenteController_delete56_invoker = createInvoker(
    ClientVenteController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientVenteController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """client-ventes/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_FactureVenteController_reads57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes")))
  )
  private[this] lazy val controllers_FactureVenteController_reads57_invoker = createInvoker(
    FactureVenteController_18.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "reads",
      Nil,
      "GET",
      """ Facture Vente""",
      this.prefix + """facture-ventes"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_FactureVenteController_create58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes")))
  )
  private[this] lazy val controllers_FactureVenteController_create58_invoker = createInvoker(
    FactureVenteController_18.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """facture-ventes"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_FactureVenteController_read59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FactureVenteController_read59_invoker = createInvoker(
    FactureVenteController_18.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_FactureVenteController_update60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_FactureVenteController_update60_invoker = createInvoker(
    FactureVenteController_18.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_FactureVenteController_delete61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_FactureVenteController_delete61_invoker = createInvoker(
    FactureVenteController_18.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_FactureVenteController_edit62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_FactureVenteController_edit62_invoker = createInvoker(
    FactureVenteController_18.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>/edit"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_FactureVenteController_generateProforma63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureVente", """[^/]+""",true), StaticPart("/generate/proforma")))
  )
  private[this] lazy val controllers_FactureVenteController_generateProforma63_invoker = createInvoker(
    FactureVenteController_18.generateProforma(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "generateProforma",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureVente<[^/]+>/generate/proforma"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_FactureVenteController_generateDefinitive64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureVente", """[^/]+""",true), StaticPart("/generate/definitive")))
  )
  private[this] lazy val controllers_FactureVenteController_generateDefinitive64_invoker = createInvoker(
    FactureVenteController_18.generateDefinitive(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureVenteController",
      "generateDefinitive",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureVente<[^/]+>/generate/definitive"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_FactureTransportController_reads65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports")))
  )
  private[this] lazy val controllers_FactureTransportController_reads65_invoker = createInvoker(
    FactureTransportController_13.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "reads",
      Nil,
      "GET",
      """ Facture Transport""",
      this.prefix + """facture-transports"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_FactureTransportController_create66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports")))
  )
  private[this] lazy val controllers_FactureTransportController_create66_invoker = createInvoker(
    FactureTransportController_13.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """facture-transports"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_FactureTransportController_read67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FactureTransportController_read67_invoker = createInvoker(
    FactureTransportController_13.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_FactureTransportController_update68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_FactureTransportController_update68_invoker = createInvoker(
    FactureTransportController_13.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_FactureTransportController_delete69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_FactureTransportController_delete69_invoker = createInvoker(
    FactureTransportController_13.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_FactureTransportController_edit70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_FactureTransportController_edit70_invoker = createInvoker(
    FactureTransportController_13.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/edit"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_FactureTransportController_generateProforma71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureTransport", """[^/]+""",true), StaticPart("/generate/proforma")))
  )
  private[this] lazy val controllers_FactureTransportController_generateProforma71_invoker = createInvoker(
    FactureTransportController_13.generateProforma(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "generateProforma",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/proforma"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_FactureTransportController_generateDefinitive72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureTransport", """[^/]+""",true), StaticPart("/generate/definitive")))
  )
  private[this] lazy val controllers_FactureTransportController_generateDefinitive72_invoker = createInvoker(
    FactureTransportController_13.generateDefinitive(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "generateDefinitive",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/definitive"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_FactureTransportController_generateProformaSonidep73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureTransport", """[^/]+""",true), StaticPart("/generate/proforma-sonidep")))
  )
  private[this] lazy val controllers_FactureTransportController_generateProformaSonidep73_invoker = createInvoker(
    FactureTransportController_13.generateProformaSonidep(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "generateProformaSonidep",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/proforma-sonidep"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_FactureTransportController_generateDefinitiveSonidep74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reference/"), DynamicPart("referenceImpressionFactureTransport", """[^/]+""",true), StaticPart("/generate/definitive-sonidep")))
  )
  private[this] lazy val controllers_FactureTransportController_generateDefinitiveSonidep74_invoker = createInvoker(
    FactureTransportController_13.generateDefinitiveSonidep(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactureTransportController",
      "generateDefinitiveSonidep",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """id<[^/]+>/reference/""" + "$" + """referenceImpressionFactureTransport<[^/]+>/generate/definitive-sonidep"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_CommandeVenteController_reads75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("commande-ventes")))
  )
  private[this] lazy val controllers_CommandeVenteController_reads75_invoker = createInvoker(
    CommandeVenteController_11.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeVenteController",
      "reads",
      Nil,
      "GET",
      """ Commande Vente""",
      this.prefix + """commande-ventes"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_CommandeVenteController_create76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes")))
  )
  private[this] lazy val controllers_CommandeVenteController_create76_invoker = createInvoker(
    CommandeVenteController_11.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeVenteController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes"""
    )
  )

  // @LINE:107
  private[this] lazy val controllers_CommandeVenteController_read77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommandeVenteController_read77_invoker = createInvoker(
    CommandeVenteController_11.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeVenteController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_CommandeVenteController_update78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_CommandeVenteController_update78_invoker = createInvoker(
    CommandeVenteController_11.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeVenteController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_CommandeVenteController_delete79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_CommandeVenteController_delete79_invoker = createInvoker(
    CommandeVenteController_11.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeVenteController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:112
  private[this] lazy val controllers_CommandeTransportController_reads80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("commande-transports")))
  )
  private[this] lazy val controllers_CommandeTransportController_reads80_invoker = createInvoker(
    CommandeTransportController_21.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeTransportController",
      "reads",
      Nil,
      "GET",
      """ Commande Transport""",
      this.prefix + """commande-transports"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_CommandeTransportController_create81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes")))
  )
  private[this] lazy val controllers_CommandeTransportController_create81_invoker = createInvoker(
    CommandeTransportController_21.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeTransportController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_CommandeTransportController_read82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommandeTransportController_read82_invoker = createInvoker(
    CommandeTransportController_21.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeTransportController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_CommandeTransportController_update83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_CommandeTransportController_update83_invoker = createInvoker(
    CommandeTransportController_21.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeTransportController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:116
  private[this] lazy val controllers_CommandeTransportController_delete84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/commandes/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_CommandeTransportController_delete84_invoker = createInvoker(
    CommandeTransportController_21.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommandeTransportController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/commandes/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:119
  private[this] lazy val controllers_PaiementVenteController_reads85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiement-ventes")))
  )
  private[this] lazy val controllers_PaiementVenteController_reads85_invoker = createInvoker(
    PaiementVenteController_19.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "reads",
      Nil,
      "GET",
      """ Paiement Vente""",
      this.prefix + """paiement-ventes"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_PaiementVenteController_create86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements")))
  )
  private[this] lazy val controllers_PaiementVenteController_create86_invoker = createInvoker(
    PaiementVenteController_19.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements"""
    )
  )

  // @LINE:121
  private[this] lazy val controllers_PaiementVenteController_read87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaiementVenteController_read87_invoker = createInvoker(
    PaiementVenteController_19.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_PaiementVenteController_traiter88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/traiter")))
  )
  private[this] lazy val controllers_PaiementVenteController_traiter88_invoker = createInvoker(
    PaiementVenteController_19.traiter(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "traiter",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/traiter"""
    )
  )

  // @LINE:123
  private[this] lazy val controllers_PaiementVenteController_update89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_PaiementVenteController_update89_invoker = createInvoker(
    PaiementVenteController_19.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:124
  private[this] lazy val controllers_PaiementVenteController_delete90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-ventes/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_PaiementVenteController_delete90_invoker = createInvoker(
    PaiementVenteController_19.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementVenteController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-ventes/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:127
  private[this] lazy val controllers_PaiementTransportController_reads91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiement-transports")))
  )
  private[this] lazy val controllers_PaiementTransportController_reads91_invoker = createInvoker(
    PaiementTransportController_1.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "reads",
      Nil,
      "GET",
      """ Paiement Transport""",
      this.prefix + """paiement-transports"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_PaiementTransportController_create92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements")))
  )
  private[this] lazy val controllers_PaiementTransportController_create92_invoker = createInvoker(
    PaiementTransportController_1.create(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "create",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements"""
    )
  )

  // @LINE:129
  private[this] lazy val controllers_PaiementTransportController_read93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaiementTransportController_read93_invoker = createInvoker(
    PaiementTransportController_1.read(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "read",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:130
  private[this] lazy val controllers_PaiementTransportController_traiter94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/traiter")))
  )
  private[this] lazy val controllers_PaiementTransportController_traiter94_invoker = createInvoker(
    PaiementTransportController_1.traiter(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "traiter",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/traiter"""
    )
  )

  // @LINE:131
  private[this] lazy val controllers_PaiementTransportController_update95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_PaiementTransportController_update95_invoker = createInvoker(
    PaiementTransportController_1.update(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "update",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:132
  private[this] lazy val controllers_PaiementTransportController_delete96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facture-transports/"), DynamicPart("idParent", """[^/]+""",true), StaticPart("/paiements/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_PaiementTransportController_delete96_invoker = createInvoker(
    PaiementTransportController_1.delete(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementTransportController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """facture-transports/""" + "$" + """idParent<[^/]+>/paiements/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:135
  private[this] lazy val controllers_CamionController_reads97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("camions")))
  )
  private[this] lazy val controllers_CamionController_reads97_invoker = createInvoker(
    CamionController_8.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CamionController",
      "reads",
      Nil,
      "GET",
      """ Camion""",
      this.prefix + """camions"""
    )
  )

  // @LINE:136
  private[this] lazy val controllers_CamionController_create98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("camions")))
  )
  private[this] lazy val controllers_CamionController_create98_invoker = createInvoker(
    CamionController_8.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CamionController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """camions"""
    )
  )

  // @LINE:137
  private[this] lazy val controllers_CamionController_read99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("camions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CamionController_read99_invoker = createInvoker(
    CamionController_8.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CamionController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """camions/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:138
  private[this] lazy val controllers_CamionController_update100_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("camions/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_CamionController_update100_invoker = createInvoker(
    CamionController_8.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CamionController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """camions/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:139
  private[this] lazy val controllers_CamionController_delete101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("camions/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_CamionController_delete101_invoker = createInvoker(
    CamionController_8.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CamionController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """camions/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:142
  private[this] lazy val controllers_DepenseController_reads102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("depenses")))
  )
  private[this] lazy val controllers_DepenseController_reads102_invoker = createInvoker(
    DepenseController_15.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepenseController",
      "reads",
      Nil,
      "GET",
      """ Depense""",
      this.prefix + """depenses"""
    )
  )

  // @LINE:143
  private[this] lazy val controllers_DepenseController_create103_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("depenses")))
  )
  private[this] lazy val controllers_DepenseController_create103_invoker = createInvoker(
    DepenseController_15.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepenseController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """depenses"""
    )
  )

  // @LINE:144
  private[this] lazy val controllers_DepenseController_read104_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("depenses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DepenseController_read104_invoker = createInvoker(
    DepenseController_15.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepenseController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """depenses/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:145
  private[this] lazy val controllers_DepenseController_update105_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("depenses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_DepenseController_update105_invoker = createInvoker(
    DepenseController_15.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepenseController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """depenses/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:146
  private[this] lazy val controllers_DepenseController_delete106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("depenses/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_DepenseController_delete106_invoker = createInvoker(
    DepenseController_15.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepenseController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """depenses/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:149
  private[this] lazy val controllers_PersonnelController_reads107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personnels")))
  )
  private[this] lazy val controllers_PersonnelController_reads107_invoker = createInvoker(
    PersonnelController_4.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonnelController",
      "reads",
      Nil,
      "GET",
      """ Personnel""",
      this.prefix + """personnels"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_PersonnelController_create108_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personnels")))
  )
  private[this] lazy val controllers_PersonnelController_create108_invoker = createInvoker(
    PersonnelController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonnelController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """personnels"""
    )
  )

  // @LINE:151
  private[this] lazy val controllers_PersonnelController_read109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personnels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonnelController_read109_invoker = createInvoker(
    PersonnelController_4.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonnelController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """personnels/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:152
  private[this] lazy val controllers_PersonnelController_update110_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personnels/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_PersonnelController_update110_invoker = createInvoker(
    PersonnelController_4.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonnelController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """personnels/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:153
  private[this] lazy val controllers_PersonnelController_delete111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("personnels/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_PersonnelController_delete111_invoker = createInvoker(
    PersonnelController_4.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonnelController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """personnels/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:156
  private[this] lazy val controllers_ProduitController_reads112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produits")))
  )
  private[this] lazy val controllers_ProduitController_reads112_invoker = createInvoker(
    ProduitController_7.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProduitController",
      "reads",
      Nil,
      "GET",
      """ Produit""",
      this.prefix + """produits"""
    )
  )

  // @LINE:157
  private[this] lazy val controllers_ProduitController_create113_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produits")))
  )
  private[this] lazy val controllers_ProduitController_create113_invoker = createInvoker(
    ProduitController_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProduitController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """produits"""
    )
  )

  // @LINE:158
  private[this] lazy val controllers_ProduitController_read114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produits/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProduitController_read114_invoker = createInvoker(
    ProduitController_7.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProduitController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """produits/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:159
  private[this] lazy val controllers_ProduitController_update115_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produits/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_ProduitController_update115_invoker = createInvoker(
    ProduitController_7.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProduitController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """produits/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:160
  private[this] lazy val controllers_ProduitController_delete116_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produits/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ProduitController_delete116_invoker = createInvoker(
    ProduitController_7.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProduitController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """produits/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:163
  private[this] lazy val controllers_ProprietaireController_reads117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proprietaires")))
  )
  private[this] lazy val controllers_ProprietaireController_reads117_invoker = createInvoker(
    ProprietaireController_6.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProprietaireController",
      "reads",
      Nil,
      "GET",
      """ Proprietaire""",
      this.prefix + """proprietaires"""
    )
  )

  // @LINE:164
  private[this] lazy val controllers_ProprietaireController_create118_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proprietaires")))
  )
  private[this] lazy val controllers_ProprietaireController_create118_invoker = createInvoker(
    ProprietaireController_6.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProprietaireController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """proprietaires"""
    )
  )

  // @LINE:165
  private[this] lazy val controllers_ProprietaireController_read119_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proprietaires/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProprietaireController_read119_invoker = createInvoker(
    ProprietaireController_6.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProprietaireController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """proprietaires/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:166
  private[this] lazy val controllers_ProprietaireController_update120_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proprietaires/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_ProprietaireController_update120_invoker = createInvoker(
    ProprietaireController_6.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProprietaireController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """proprietaires/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:167
  private[this] lazy val controllers_ProprietaireController_delete121_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proprietaires/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ProprietaireController_delete121_invoker = createInvoker(
    ProprietaireController_6.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProprietaireController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """proprietaires/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:170
  private[this] lazy val controllers_SalaireController_reads122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salaires")))
  )
  private[this] lazy val controllers_SalaireController_reads122_invoker = createInvoker(
    SalaireController_24.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaireController",
      "reads",
      Nil,
      "GET",
      """ Salaire""",
      this.prefix + """salaires"""
    )
  )

  // @LINE:171
  private[this] lazy val controllers_SalaireController_create123_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salaires")))
  )
  private[this] lazy val controllers_SalaireController_create123_invoker = createInvoker(
    SalaireController_24.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaireController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """salaires"""
    )
  )

  // @LINE:172
  private[this] lazy val controllers_SalaireController_read124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salaires/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaireController_read124_invoker = createInvoker(
    SalaireController_24.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaireController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """salaires/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:173
  private[this] lazy val controllers_SalaireController_update125_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salaires/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_SalaireController_update125_invoker = createInvoker(
    SalaireController_24.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaireController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """salaires/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:174
  private[this] lazy val controllers_SalaireController_delete126_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salaires/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_SalaireController_delete126_invoker = createInvoker(
    SalaireController_24.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaireController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """salaires/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:177
  private[this] lazy val controllers_UtilisateurController_reads127_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("utilisateurs")))
  )
  private[this] lazy val controllers_UtilisateurController_reads127_invoker = createInvoker(
    UtilisateurController_17.reads(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtilisateurController",
      "reads",
      Nil,
      "GET",
      """ Utilisateur""",
      this.prefix + """utilisateurs"""
    )
  )

  // @LINE:178
  private[this] lazy val controllers_UtilisateurController_create128_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("utilisateurs")))
  )
  private[this] lazy val controllers_UtilisateurController_create128_invoker = createInvoker(
    UtilisateurController_17.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtilisateurController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """utilisateurs"""
    )
  )

  // @LINE:179
  private[this] lazy val controllers_UtilisateurController_read129_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("utilisateurs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UtilisateurController_read129_invoker = createInvoker(
    UtilisateurController_17.read(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtilisateurController",
      "read",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """utilisateurs/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:180
  private[this] lazy val controllers_UtilisateurController_update130_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("utilisateurs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_UtilisateurController_update130_invoker = createInvoker(
    UtilisateurController_17.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtilisateurController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """utilisateurs/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:181
  private[this] lazy val controllers_UtilisateurController_delete131_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("utilisateurs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_UtilisateurController_delete131_invoker = createInvoker(
    UtilisateurController_17.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UtilisateurController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """utilisateurs/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:184
  private[this] lazy val controllers_RapportController_download132_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rapport/download/"), DynamicPart("folder", """[^/]+""",true), StaticPart("/"), DynamicPart("reference", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RapportController_download132_invoker = createInvoker(
    RapportController_12.download(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RapportController",
      "download",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Rapport""",
      this.prefix + """rapport/download/""" + "$" + """folder<[^/]+>/""" + "$" + """reference<[^/]+>"""
    )
  )

  // @LINE:187
  private[this] lazy val controllers_Assets_versioned133_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned133_invoker = createInvoker(
    Assets_22.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index)
      }
  
    // @LINE:3
    case controllers_HomeController_connexion1_route(params) =>
      call { 
        controllers_HomeController_connexion1_invoker.call(HomeController_5.connexion())
      }
  
    // @LINE:4
    case controllers_HomeController_deconnexion2_route(params) =>
      call { 
        controllers_HomeController_deconnexion2_invoker.call(HomeController_5.deconnexion())
      }
  
    // @LINE:5
    case controllers_HomeController_inscription3_route(params) =>
      call { 
        controllers_HomeController_inscription3_invoker.call(HomeController_5.inscription())
      }
  
    // @LINE:6
    case controllers_HomeController_authentification4_route(params) =>
      call { 
        controllers_HomeController_authentification4_invoker.call(HomeController_5.authentification())
      }
  
    // @LINE:7
    case controllers_HomeController_errorClient5_route(params) =>
      call { 
        controllers_HomeController_errorClient5_invoker.call(HomeController_5.errorClient())
      }
  
    // @LINE:8
    case controllers_HomeController_errorServer6_route(params) =>
      call(params.fromQuery[String]("message", None)) { (message) =>
        controllers_HomeController_errorServer6_invoker.call(HomeController_5.errorServer(message))
      }
  
    // @LINE:12
    case controllers_ArticleController_reads7_route(params) =>
      call { 
        controllers_ArticleController_reads7_invoker.call(ArticleController_10.reads())
      }
  
    // @LINE:13
    case controllers_ArticleController_create8_route(params) =>
      call { 
        controllers_ArticleController_create8_invoker.call(ArticleController_10.create())
      }
  
    // @LINE:14
    case controllers_ArticleController_read9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArticleController_read9_invoker.call(ArticleController_10.read(id))
      }
  
    // @LINE:15
    case controllers_ArticleController_update10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArticleController_update10_invoker.call(ArticleController_10.update(id))
      }
  
    // @LINE:16
    case controllers_ArticleController_delete11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ArticleController_delete11_invoker.call(ArticleController_10.delete(id))
      }
  
    // @LINE:19
    case controllers_EntreeArticleController_create12_route(params) =>
      call(params.fromPath[Long]("idArticle", None)) { (idArticle) =>
        controllers_EntreeArticleController_create12_invoker.call(EntreeArticleController_0.create(idArticle))
      }
  
    // @LINE:20
    case controllers_EntreeArticleController_read13_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_EntreeArticleController_read13_invoker.call(EntreeArticleController_0.read(idArticle, id))
      }
  
    // @LINE:21
    case controllers_EntreeArticleController_update14_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_EntreeArticleController_update14_invoker.call(EntreeArticleController_0.update(idArticle, id))
      }
  
    // @LINE:22
    case controllers_EntreeArticleController_delete15_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_EntreeArticleController_delete15_invoker.call(EntreeArticleController_0.delete(idArticle, id))
      }
  
    // @LINE:25
    case controllers_SortieArticleController_create16_route(params) =>
      call(params.fromPath[Long]("idArticle", None)) { (idArticle) =>
        controllers_SortieArticleController_create16_invoker.call(SortieArticleController_9.create(idArticle))
      }
  
    // @LINE:26
    case controllers_SortieArticleController_read17_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_SortieArticleController_read17_invoker.call(SortieArticleController_9.read(idArticle, id))
      }
  
    // @LINE:27
    case controllers_SortieArticleController_update18_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_SortieArticleController_update18_invoker.call(SortieArticleController_9.update(idArticle, id))
      }
  
    // @LINE:28
    case controllers_SortieArticleController_delete19_route(params) =>
      call(params.fromPath[Long]("idArticle", None), params.fromPath[Long]("id", None)) { (idArticle, id) =>
        controllers_SortieArticleController_delete19_invoker.call(SortieArticleController_9.delete(idArticle, id))
      }
  
    // @LINE:31
    case controllers_BonReparationController_reads20_route(params) =>
      call { 
        controllers_BonReparationController_reads20_invoker.call(BonReparationController_2.reads())
      }
  
    // @LINE:32
    case controllers_BonReparationController_create21_route(params) =>
      call { 
        controllers_BonReparationController_create21_invoker.call(BonReparationController_2.create())
      }
  
    // @LINE:33
    case controllers_BonReparationController_read22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BonReparationController_read22_invoker.call(BonReparationController_2.read(id))
      }
  
    // @LINE:34
    case controllers_BonReparationController_update23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BonReparationController_update23_invoker.call(BonReparationController_2.update(id))
      }
  
    // @LINE:35
    case controllers_BonReparationController_delete24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BonReparationController_delete24_invoker.call(BonReparationController_2.delete(id))
      }
  
    // @LINE:36
    case controllers_BonReparationController_generateBonReparation25_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionBonReparation", None)) { (id, referenceImpressionBonReparation) =>
        controllers_BonReparationController_generateBonReparation25_invoker.call(BonReparationController_2.generateBonReparation(id, referenceImpressionBonReparation))
      }
  
    // @LINE:39
    case controllers_DemandeTravauxController_reads26_route(params) =>
      call { 
        controllers_DemandeTravauxController_reads26_invoker.call(DemandeTravauxController_16.reads())
      }
  
    // @LINE:40
    case controllers_DemandeTravauxController_create27_route(params) =>
      call { 
        controllers_DemandeTravauxController_create27_invoker.call(DemandeTravauxController_16.create())
      }
  
    // @LINE:41
    case controllers_DemandeTravauxController_read28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DemandeTravauxController_read28_invoker.call(DemandeTravauxController_16.read(id))
      }
  
    // @LINE:42
    case controllers_DemandeTravauxController_edit29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DemandeTravauxController_edit29_invoker.call(DemandeTravauxController_16.edit(id))
      }
  
    // @LINE:43
    case controllers_DemandeTravauxController_update30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DemandeTravauxController_update30_invoker.call(DemandeTravauxController_16.update(id))
      }
  
    // @LINE:44
    case controllers_DemandeTravauxController_delete31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DemandeTravauxController_delete31_invoker.call(DemandeTravauxController_16.delete(id))
      }
  
    // @LINE:45
    case controllers_DemandeTravauxController_generateDemandeTravaux32_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionDemandeTravaux", None)) { (id, referenceImpressionDemandeTravaux) =>
        controllers_DemandeTravauxController_generateDemandeTravaux32_invoker.call(DemandeTravauxController_16.generateDemandeTravaux(id, referenceImpressionDemandeTravaux))
      }
  
    // @LINE:48
    case controllers_TafController_readsByReparation33_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_TafController_readsByReparation33_invoker.call(TafController_23.readsByReparation(idParent))
      }
  
    // @LINE:49
    case controllers_TafController_create34_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_TafController_create34_invoker.call(TafController_23.create(idParent))
      }
  
    // @LINE:50
    case controllers_TafController_read35_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_TafController_read35_invoker.call(TafController_23.read(idParent, id))
      }
  
    // @LINE:51
    case controllers_TafController_update36_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_TafController_update36_invoker.call(TafController_23.update(idParent, id))
      }
  
    // @LINE:52
    case controllers_TafController_delete37_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_TafController_delete37_invoker.call(TafController_23.delete(idParent, id))
      }
  
    // @LINE:55
    case controllers_OrdrePaiementController_reads38_route(params) =>
      call { 
        controllers_OrdrePaiementController_reads38_invoker.call(OrdrePaiementController_20.reads())
      }
  
    // @LINE:56
    case controllers_OrdrePaiementController_create39_route(params) =>
      call { 
        controllers_OrdrePaiementController_create39_invoker.call(OrdrePaiementController_20.create())
      }
  
    // @LINE:57
    case controllers_OrdrePaiementController_read40_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrdrePaiementController_read40_invoker.call(OrdrePaiementController_20.read(id))
      }
  
    // @LINE:58
    case controllers_OrdrePaiementController_edit41_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrdrePaiementController_edit41_invoker.call(OrdrePaiementController_20.edit(id))
      }
  
    // @LINE:59
    case controllers_OrdrePaiementController_update42_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrdrePaiementController_update42_invoker.call(OrdrePaiementController_20.update(id))
      }
  
    // @LINE:60
    case controllers_OrdrePaiementController_delete43_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrdrePaiementController_delete43_invoker.call(OrdrePaiementController_20.delete(id))
      }
  
    // @LINE:61
    case controllers_TafController_read244_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_TafController_read244_invoker.call(TafController_23.read2(idParent, id))
      }
  
    // @LINE:62
    case controllers_TafController_update245_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_TafController_update245_invoker.call(TafController_23.update2(idParent, id))
      }
  
    // @LINE:63
    case controllers_OrdrePaiementController_generateOrdrePaiement46_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionOrdrePaiement", None)) { (id, referenceImpressionOrdrePaiement) =>
        controllers_OrdrePaiementController_generateOrdrePaiement46_invoker.call(OrdrePaiementController_20.generateOrdrePaiement(id, referenceImpressionOrdrePaiement))
      }
  
    // @LINE:66
    case controllers_ClientTransportController_reads47_route(params) =>
      call { 
        controllers_ClientTransportController_reads47_invoker.call(ClientTransportController_14.reads())
      }
  
    // @LINE:67
    case controllers_ClientTransportController_create48_route(params) =>
      call { 
        controllers_ClientTransportController_create48_invoker.call(ClientTransportController_14.create())
      }
  
    // @LINE:68
    case controllers_ClientTransportController_read49_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientTransportController_read49_invoker.call(ClientTransportController_14.read(id))
      }
  
    // @LINE:69
    case controllers_ClientTransportController_update50_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientTransportController_update50_invoker.call(ClientTransportController_14.update(id))
      }
  
    // @LINE:70
    case controllers_ClientTransportController_delete51_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientTransportController_delete51_invoker.call(ClientTransportController_14.delete(id))
      }
  
    // @LINE:73
    case controllers_ClientVenteController_reads52_route(params) =>
      call { 
        controllers_ClientVenteController_reads52_invoker.call(ClientVenteController_3.reads())
      }
  
    // @LINE:74
    case controllers_ClientVenteController_create53_route(params) =>
      call { 
        controllers_ClientVenteController_create53_invoker.call(ClientVenteController_3.create())
      }
  
    // @LINE:75
    case controllers_ClientVenteController_read54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientVenteController_read54_invoker.call(ClientVenteController_3.read(id))
      }
  
    // @LINE:76
    case controllers_ClientVenteController_update55_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientVenteController_update55_invoker.call(ClientVenteController_3.update(id))
      }
  
    // @LINE:77
    case controllers_ClientVenteController_delete56_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientVenteController_delete56_invoker.call(ClientVenteController_3.delete(id))
      }
  
    // @LINE:80
    case controllers_FactureVenteController_reads57_route(params) =>
      call { 
        controllers_FactureVenteController_reads57_invoker.call(FactureVenteController_18.reads())
      }
  
    // @LINE:81
    case controllers_FactureVenteController_create58_route(params) =>
      call { 
        controllers_FactureVenteController_create58_invoker.call(FactureVenteController_18.create())
      }
  
    // @LINE:82
    case controllers_FactureVenteController_read59_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureVenteController_read59_invoker.call(FactureVenteController_18.read(id))
      }
  
    // @LINE:83
    case controllers_FactureVenteController_update60_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureVenteController_update60_invoker.call(FactureVenteController_18.update(id))
      }
  
    // @LINE:84
    case controllers_FactureVenteController_delete61_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureVenteController_delete61_invoker.call(FactureVenteController_18.delete(id))
      }
  
    // @LINE:85
    case controllers_FactureVenteController_edit62_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureVenteController_edit62_invoker.call(FactureVenteController_18.edit(id))
      }
  
    // @LINE:86
    case controllers_FactureVenteController_generateProforma63_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureVente", None)) { (id, referenceImpressionFactureVente) =>
        controllers_FactureVenteController_generateProforma63_invoker.call(FactureVenteController_18.generateProforma(id, referenceImpressionFactureVente))
      }
  
    // @LINE:87
    case controllers_FactureVenteController_generateDefinitive64_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureVente", None)) { (id, referenceImpressionFactureVente) =>
        controllers_FactureVenteController_generateDefinitive64_invoker.call(FactureVenteController_18.generateDefinitive(id, referenceImpressionFactureVente))
      }
  
    // @LINE:91
    case controllers_FactureTransportController_reads65_route(params) =>
      call { 
        controllers_FactureTransportController_reads65_invoker.call(FactureTransportController_13.reads())
      }
  
    // @LINE:92
    case controllers_FactureTransportController_create66_route(params) =>
      call { 
        controllers_FactureTransportController_create66_invoker.call(FactureTransportController_13.create())
      }
  
    // @LINE:93
    case controllers_FactureTransportController_read67_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureTransportController_read67_invoker.call(FactureTransportController_13.read(id))
      }
  
    // @LINE:94
    case controllers_FactureTransportController_update68_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureTransportController_update68_invoker.call(FactureTransportController_13.update(id))
      }
  
    // @LINE:95
    case controllers_FactureTransportController_delete69_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureTransportController_delete69_invoker.call(FactureTransportController_13.delete(id))
      }
  
    // @LINE:96
    case controllers_FactureTransportController_edit70_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FactureTransportController_edit70_invoker.call(FactureTransportController_13.edit(id))
      }
  
    // @LINE:97
    case controllers_FactureTransportController_generateProforma71_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureTransport", None)) { (id, referenceImpressionFactureTransport) =>
        controllers_FactureTransportController_generateProforma71_invoker.call(FactureTransportController_13.generateProforma(id, referenceImpressionFactureTransport))
      }
  
    // @LINE:98
    case controllers_FactureTransportController_generateDefinitive72_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureTransport", None)) { (id, referenceImpressionFactureTransport) =>
        controllers_FactureTransportController_generateDefinitive72_invoker.call(FactureTransportController_13.generateDefinitive(id, referenceImpressionFactureTransport))
      }
  
    // @LINE:99
    case controllers_FactureTransportController_generateProformaSonidep73_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureTransport", None)) { (id, referenceImpressionFactureTransport) =>
        controllers_FactureTransportController_generateProformaSonidep73_invoker.call(FactureTransportController_13.generateProformaSonidep(id, referenceImpressionFactureTransport))
      }
  
    // @LINE:100
    case controllers_FactureTransportController_generateDefinitiveSonidep74_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("referenceImpressionFactureTransport", None)) { (id, referenceImpressionFactureTransport) =>
        controllers_FactureTransportController_generateDefinitiveSonidep74_invoker.call(FactureTransportController_13.generateDefinitiveSonidep(id, referenceImpressionFactureTransport))
      }
  
    // @LINE:105
    case controllers_CommandeVenteController_reads75_route(params) =>
      call { 
        controllers_CommandeVenteController_reads75_invoker.call(CommandeVenteController_11.reads())
      }
  
    // @LINE:106
    case controllers_CommandeVenteController_create76_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_CommandeVenteController_create76_invoker.call(CommandeVenteController_11.create(idParent))
      }
  
    // @LINE:107
    case controllers_CommandeVenteController_read77_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeVenteController_read77_invoker.call(CommandeVenteController_11.read(idParent, id))
      }
  
    // @LINE:108
    case controllers_CommandeVenteController_update78_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeVenteController_update78_invoker.call(CommandeVenteController_11.update(idParent, id))
      }
  
    // @LINE:109
    case controllers_CommandeVenteController_delete79_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeVenteController_delete79_invoker.call(CommandeVenteController_11.delete(idParent, id))
      }
  
    // @LINE:112
    case controllers_CommandeTransportController_reads80_route(params) =>
      call { 
        controllers_CommandeTransportController_reads80_invoker.call(CommandeTransportController_21.reads())
      }
  
    // @LINE:113
    case controllers_CommandeTransportController_create81_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_CommandeTransportController_create81_invoker.call(CommandeTransportController_21.create(idParent))
      }
  
    // @LINE:114
    case controllers_CommandeTransportController_read82_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeTransportController_read82_invoker.call(CommandeTransportController_21.read(idParent, id))
      }
  
    // @LINE:115
    case controllers_CommandeTransportController_update83_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeTransportController_update83_invoker.call(CommandeTransportController_21.update(idParent, id))
      }
  
    // @LINE:116
    case controllers_CommandeTransportController_delete84_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_CommandeTransportController_delete84_invoker.call(CommandeTransportController_21.delete(idParent, id))
      }
  
    // @LINE:119
    case controllers_PaiementVenteController_reads85_route(params) =>
      call { 
        controllers_PaiementVenteController_reads85_invoker.call(PaiementVenteController_19.reads())
      }
  
    // @LINE:120
    case controllers_PaiementVenteController_create86_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_PaiementVenteController_create86_invoker.call(PaiementVenteController_19.create(idParent))
      }
  
    // @LINE:121
    case controllers_PaiementVenteController_read87_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementVenteController_read87_invoker.call(PaiementVenteController_19.read(idParent, id))
      }
  
    // @LINE:122
    case controllers_PaiementVenteController_traiter88_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementVenteController_traiter88_invoker.call(PaiementVenteController_19.traiter(idParent, id))
      }
  
    // @LINE:123
    case controllers_PaiementVenteController_update89_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementVenteController_update89_invoker.call(PaiementVenteController_19.update(idParent, id))
      }
  
    // @LINE:124
    case controllers_PaiementVenteController_delete90_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementVenteController_delete90_invoker.call(PaiementVenteController_19.delete(idParent, id))
      }
  
    // @LINE:127
    case controllers_PaiementTransportController_reads91_route(params) =>
      call { 
        controllers_PaiementTransportController_reads91_invoker.call(PaiementTransportController_1.reads())
      }
  
    // @LINE:128
    case controllers_PaiementTransportController_create92_route(params) =>
      call(params.fromPath[Long]("idParent", None)) { (idParent) =>
        controllers_PaiementTransportController_create92_invoker.call(PaiementTransportController_1.create(idParent))
      }
  
    // @LINE:129
    case controllers_PaiementTransportController_read93_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementTransportController_read93_invoker.call(PaiementTransportController_1.read(idParent, id))
      }
  
    // @LINE:130
    case controllers_PaiementTransportController_traiter94_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementTransportController_traiter94_invoker.call(PaiementTransportController_1.traiter(idParent, id))
      }
  
    // @LINE:131
    case controllers_PaiementTransportController_update95_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementTransportController_update95_invoker.call(PaiementTransportController_1.update(idParent, id))
      }
  
    // @LINE:132
    case controllers_PaiementTransportController_delete96_route(params) =>
      call(params.fromPath[Long]("idParent", None), params.fromPath[Long]("id", None)) { (idParent, id) =>
        controllers_PaiementTransportController_delete96_invoker.call(PaiementTransportController_1.delete(idParent, id))
      }
  
    // @LINE:135
    case controllers_CamionController_reads97_route(params) =>
      call { 
        controllers_CamionController_reads97_invoker.call(CamionController_8.reads())
      }
  
    // @LINE:136
    case controllers_CamionController_create98_route(params) =>
      call { 
        controllers_CamionController_create98_invoker.call(CamionController_8.create())
      }
  
    // @LINE:137
    case controllers_CamionController_read99_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CamionController_read99_invoker.call(CamionController_8.read(id))
      }
  
    // @LINE:138
    case controllers_CamionController_update100_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CamionController_update100_invoker.call(CamionController_8.update(id))
      }
  
    // @LINE:139
    case controllers_CamionController_delete101_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CamionController_delete101_invoker.call(CamionController_8.delete(id))
      }
  
    // @LINE:142
    case controllers_DepenseController_reads102_route(params) =>
      call { 
        controllers_DepenseController_reads102_invoker.call(DepenseController_15.reads())
      }
  
    // @LINE:143
    case controllers_DepenseController_create103_route(params) =>
      call { 
        controllers_DepenseController_create103_invoker.call(DepenseController_15.create())
      }
  
    // @LINE:144
    case controllers_DepenseController_read104_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DepenseController_read104_invoker.call(DepenseController_15.read(id))
      }
  
    // @LINE:145
    case controllers_DepenseController_update105_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DepenseController_update105_invoker.call(DepenseController_15.update(id))
      }
  
    // @LINE:146
    case controllers_DepenseController_delete106_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DepenseController_delete106_invoker.call(DepenseController_15.delete(id))
      }
  
    // @LINE:149
    case controllers_PersonnelController_reads107_route(params) =>
      call { 
        controllers_PersonnelController_reads107_invoker.call(PersonnelController_4.reads())
      }
  
    // @LINE:150
    case controllers_PersonnelController_create108_route(params) =>
      call { 
        controllers_PersonnelController_create108_invoker.call(PersonnelController_4.create())
      }
  
    // @LINE:151
    case controllers_PersonnelController_read109_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonnelController_read109_invoker.call(PersonnelController_4.read(id))
      }
  
    // @LINE:152
    case controllers_PersonnelController_update110_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonnelController_update110_invoker.call(PersonnelController_4.update(id))
      }
  
    // @LINE:153
    case controllers_PersonnelController_delete111_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PersonnelController_delete111_invoker.call(PersonnelController_4.delete(id))
      }
  
    // @LINE:156
    case controllers_ProduitController_reads112_route(params) =>
      call { 
        controllers_ProduitController_reads112_invoker.call(ProduitController_7.reads())
      }
  
    // @LINE:157
    case controllers_ProduitController_create113_route(params) =>
      call { 
        controllers_ProduitController_create113_invoker.call(ProduitController_7.create())
      }
  
    // @LINE:158
    case controllers_ProduitController_read114_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProduitController_read114_invoker.call(ProduitController_7.read(id))
      }
  
    // @LINE:159
    case controllers_ProduitController_update115_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProduitController_update115_invoker.call(ProduitController_7.update(id))
      }
  
    // @LINE:160
    case controllers_ProduitController_delete116_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProduitController_delete116_invoker.call(ProduitController_7.delete(id))
      }
  
    // @LINE:163
    case controllers_ProprietaireController_reads117_route(params) =>
      call { 
        controllers_ProprietaireController_reads117_invoker.call(ProprietaireController_6.reads())
      }
  
    // @LINE:164
    case controllers_ProprietaireController_create118_route(params) =>
      call { 
        controllers_ProprietaireController_create118_invoker.call(ProprietaireController_6.create())
      }
  
    // @LINE:165
    case controllers_ProprietaireController_read119_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProprietaireController_read119_invoker.call(ProprietaireController_6.read(id))
      }
  
    // @LINE:166
    case controllers_ProprietaireController_update120_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProprietaireController_update120_invoker.call(ProprietaireController_6.update(id))
      }
  
    // @LINE:167
    case controllers_ProprietaireController_delete121_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProprietaireController_delete121_invoker.call(ProprietaireController_6.delete(id))
      }
  
    // @LINE:170
    case controllers_SalaireController_reads122_route(params) =>
      call { 
        controllers_SalaireController_reads122_invoker.call(SalaireController_24.reads())
      }
  
    // @LINE:171
    case controllers_SalaireController_create123_route(params) =>
      call { 
        controllers_SalaireController_create123_invoker.call(SalaireController_24.create())
      }
  
    // @LINE:172
    case controllers_SalaireController_read124_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaireController_read124_invoker.call(SalaireController_24.read(id))
      }
  
    // @LINE:173
    case controllers_SalaireController_update125_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaireController_update125_invoker.call(SalaireController_24.update(id))
      }
  
    // @LINE:174
    case controllers_SalaireController_delete126_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaireController_delete126_invoker.call(SalaireController_24.delete(id))
      }
  
    // @LINE:177
    case controllers_UtilisateurController_reads127_route(params) =>
      call { 
        controllers_UtilisateurController_reads127_invoker.call(UtilisateurController_17.reads())
      }
  
    // @LINE:178
    case controllers_UtilisateurController_create128_route(params) =>
      call { 
        controllers_UtilisateurController_create128_invoker.call(UtilisateurController_17.create())
      }
  
    // @LINE:179
    case controllers_UtilisateurController_read129_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UtilisateurController_read129_invoker.call(UtilisateurController_17.read(id))
      }
  
    // @LINE:180
    case controllers_UtilisateurController_update130_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UtilisateurController_update130_invoker.call(UtilisateurController_17.update(id))
      }
  
    // @LINE:181
    case controllers_UtilisateurController_delete131_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UtilisateurController_delete131_invoker.call(UtilisateurController_17.delete(id))
      }
  
    // @LINE:184
    case controllers_RapportController_download132_route(params) =>
      call(params.fromPath[String]("folder", None), params.fromPath[String]("reference", None)) { (folder, reference) =>
        controllers_RapportController_download132_invoker.call(RapportController_12.download(folder, reference))
      }
  
    // @LINE:187
    case controllers_Assets_versioned133_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned133_invoker.call(Assets_22.versioned(path, file))
      }
  }
}
