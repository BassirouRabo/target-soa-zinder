
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/hydrocarbure-transport/conf/routes
// @DATE:Fri Sep 30 01:30:41 EDT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers {

  // @LINE:187
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:187
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseArticleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:13
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles")
    }
  
    // @LINE:14
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:15
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:12
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles")
    }
  
  }

  // @LINE:156
  class ReverseProduitController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produits/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:157
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "produits")
    }
  
    // @LINE:158
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produits/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:159
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "produits/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:156
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produits")
    }
  
  }

  // @LINE:91
  class ReverseFactureTransportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def generateDefinitiveSonidep(id:Long, referenceImpressionFactureTransport:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureTransport", dynamicString(referenceImpressionFactureTransport)) + "/generate/definitive-sonidep")
    }
  
    // @LINE:95
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:92
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports")
    }
  
    // @LINE:93
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:96
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
    }
  
    // @LINE:97
    def generateProforma(id:Long, referenceImpressionFactureTransport:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureTransport", dynamicString(referenceImpressionFactureTransport)) + "/generate/proforma")
    }
  
    // @LINE:94
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:98
    def generateDefinitive(id:Long, referenceImpressionFactureTransport:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureTransport", dynamicString(referenceImpressionFactureTransport)) + "/generate/definitive")
    }
  
    // @LINE:91
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports")
    }
  
    // @LINE:99
    def generateProformaSonidep(id:Long, referenceImpressionFactureTransport:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureTransport", dynamicString(referenceImpressionFactureTransport)) + "/generate/proforma-sonidep")
    }
  
  }

  // @LINE:163
  class ReverseProprietaireController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:167
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proprietaires/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:164
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "proprietaires")
    }
  
    // @LINE:165
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proprietaires/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:166
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "proprietaires/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:163
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "proprietaires")
    }
  
  }

  // @LINE:25
  class ReverseSortieArticleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def create(idArticle:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/sortie-articles/create")
    }
  
    // @LINE:27
    def update(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/sortie-articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:28
    def delete(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/sortie-articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:26
    def read(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/sortie-articles/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:119
  class ReversePaiementVenteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def read(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:123
    def update(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:122
    def traiter(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/traiter")
    }
  
    // @LINE:119
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paiement-ventes")
    }
  
    // @LINE:124
    def delete(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:120
    def create(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements")
    }
  
  }

  // @LINE:112
  class ReverseCommandeTransportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:114
    def read(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:115
    def update(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:112
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "commande-transports")
    }
  
    // @LINE:116
    def delete(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:113
    def create(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes")
    }
  
  }

  // @LINE:48
  class ReverseTafController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def update2(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:61
    def read2(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:50
    def read(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:51
    def update(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:52
    def delete(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:48
    def readsByReparation(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs")
    }
  
    // @LINE:49
    def create(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/tafs")
    }
  
  }

  // @LINE:105
  class ReverseCommandeVenteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:107
    def read(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:108
    def update(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:105
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "commande-ventes")
    }
  
    // @LINE:109
    def delete(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:106
    def create(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/commandes")
    }
  
  }

  // @LINE:177
  class ReverseUtilisateurController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:181
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "utilisateurs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:178
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "utilisateurs")
    }
  
    // @LINE:179
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "utilisateurs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:180
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "utilisateurs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:177
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "utilisateurs")
    }
  
  }

  // @LINE:142
  class ReverseDepenseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "depenses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:143
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "depenses")
    }
  
    // @LINE:144
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "depenses/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:145
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "depenses/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:142
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "depenses")
    }
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def authentification(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "connexion")
    }
  
    // @LINE:8
    def errorServer(message:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "error-server" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("message", message)))))
    }
  
    // @LINE:3
    def connexion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "connexion")
    }
  
    // @LINE:7
    def errorClient(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "error-client")
    }
  
    // @LINE:5
    def inscription(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "inscription")
    }
  
    // @LINE:2
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:4
    def deconnexion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deconnexion")
    }
  
  }

  // @LINE:31
  class ReverseBonReparationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bon-reparations/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:32
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bon-reparations")
    }
  
    // @LINE:33
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bon-reparations/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:36
    def generateBonReparation(id:Long, referenceImpressionBonReparation:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bon-reparations/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionBonReparation", dynamicString(referenceImpressionBonReparation)) + "/generate")
    }
  
    // @LINE:34
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bon-reparations/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:31
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bon-reparations")
    }
  
  }

  // @LINE:149
  class ReversePersonnelController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:153
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "personnels/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:150
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "personnels")
    }
  
    // @LINE:151
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "personnels/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:152
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "personnels/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:149
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "personnels")
    }
  
  }

  // @LINE:80
  class ReverseFactureVenteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:81
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes")
    }
  
    // @LINE:82
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:85
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
    }
  
    // @LINE:86
    def generateProforma(id:Long, referenceImpressionFactureVente:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureVente", dynamicString(referenceImpressionFactureVente)) + "/generate/proforma")
    }
  
    // @LINE:83
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:87
    def generateDefinitive(id:Long, referenceImpressionFactureVente:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionFactureVente", dynamicString(referenceImpressionFactureVente)) + "/generate/definitive")
    }
  
    // @LINE:80
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-ventes")
    }
  
  }

  // @LINE:66
  class ReverseClientTransportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:67
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client-transports")
    }
  
    // @LINE:68
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-transports/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:69
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client-transports/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:66
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-transports")
    }
  
  }

  // @LINE:39
  class ReverseDemandeTravauxController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:40
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "demande-travaux")
    }
  
    // @LINE:41
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:42
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
    }
  
    // @LINE:45
    def generateDemandeTravaux(id:Long, referenceImpressionDemandeTravaux:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travauxs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionDemandeTravaux", dynamicString(referenceImpressionDemandeTravaux)) + "/generate")
    }
  
    // @LINE:43
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "demande-travaux/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:39
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demande-travaux")
    }
  
  }

  // @LINE:19
  class ReverseEntreeArticleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def create(idArticle:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/entree-articles/create")
    }
  
    // @LINE:21
    def update(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/entree-articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:22
    def delete(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/entree-articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:20
    def read(idArticle:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("idArticle", idArticle) + "/entree-articles/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:55
  class ReverseOrdrePaiementController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:56
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ordre-paiements")
    }
  
    // @LINE:57
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:58
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
    }
  
    // @LINE:59
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:63
    def generateOrdrePaiement(id:Long, referenceImpressionOrdrePaiement:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reference/" + implicitly[PathBindable[String]].unbind("referenceImpressionOrdrePaiement", dynamicString(referenceImpressionOrdrePaiement)) + "/generate")
    }
  
    // @LINE:55
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ordre-paiements")
    }
  
  }

  // @LINE:184
  class ReverseRapportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:184
    def download(folder:String, reference:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rapport/download/" + implicitly[PathBindable[String]].unbind("folder", dynamicString(folder)) + "/" + implicitly[PathBindable[String]].unbind("reference", dynamicString(reference)))
    }
  
  }

  // @LINE:127
  class ReversePaiementTransportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def read(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:131
    def update(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:130
    def traiter(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/traiter")
    }
  
    // @LINE:127
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paiement-transports")
    }
  
    // @LINE:132
    def delete(idParent:Long, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:128
    def create(idParent:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "facture-transports/" + implicitly[PathBindable[Long]].unbind("idParent", idParent) + "/paiements")
    }
  
  }

  // @LINE:170
  class ReverseSalaireController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:174
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "salaires/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:171
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "salaires")
    }
  
    // @LINE:172
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "salaires/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:173
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "salaires/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:170
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "salaires")
    }
  
  }

  // @LINE:73
  class ReverseClientVenteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:74
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client-ventes")
    }
  
    // @LINE:75
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-ventes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:76
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "client-ventes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:73
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "client-ventes")
    }
  
  }

  // @LINE:135
  class ReverseCamionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:139
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "camions/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:136
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "camions")
    }
  
    // @LINE:137
    def read(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "camions/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:138
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "camions/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
    }
  
    // @LINE:135
    def reads(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "camions")
    }
  
  }


}
