
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/hydrocarbure-transport/conf/routes
// @DATE:Fri Sep 30 01:30:41 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:187
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:187
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseArticleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArticleController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArticleController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
        }
      """
    )
  
    // @LINE:14
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArticleController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArticleController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:12
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArticleController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
        }
      """
    )
  
  }

  // @LINE:156
  class ReverseProduitController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProduitController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produits/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:157
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProduitController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produits"})
        }
      """
    )
  
    // @LINE:158
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProduitController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produits/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:159
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProduitController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produits/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:156
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProduitController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produits"})
        }
      """
    )
  
  }

  // @LINE:91
  class ReverseFactureTransportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def generateDefinitiveSonidep: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.generateDefinitiveSonidep",
      """
        function(id0,referenceImpressionFactureTransport1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureTransport", encodeURIComponent(referenceImpressionFactureTransport1)) + "/generate/definitive-sonidep"})
        }
      """
    )
  
    // @LINE:95
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:92
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports"})
        }
      """
    )
  
    // @LINE:93
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:96
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/edit"})
        }
      """
    )
  
    // @LINE:97
    def generateProforma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.generateProforma",
      """
        function(id0,referenceImpressionFactureTransport1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureTransport", encodeURIComponent(referenceImpressionFactureTransport1)) + "/generate/proforma"})
        }
      """
    )
  
    // @LINE:94
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:98
    def generateDefinitive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.generateDefinitive",
      """
        function(id0,referenceImpressionFactureTransport1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureTransport", encodeURIComponent(referenceImpressionFactureTransport1)) + "/generate/definitive"})
        }
      """
    )
  
    // @LINE:91
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports"})
        }
      """
    )
  
    // @LINE:99
    def generateProformaSonidep: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureTransportController.generateProformaSonidep",
      """
        function(id0,referenceImpressionFactureTransport1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureTransport", encodeURIComponent(referenceImpressionFactureTransport1)) + "/generate/proforma-sonidep"})
        }
      """
    )
  
  }

  // @LINE:163
  class ReverseProprietaireController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:167
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProprietaireController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proprietaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:164
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProprietaireController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "proprietaires"})
        }
      """
    )
  
    // @LINE:165
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProprietaireController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proprietaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:166
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProprietaireController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "proprietaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:163
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProprietaireController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proprietaires"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseSortieArticleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SortieArticleController.create",
      """
        function(idArticle0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/sortie-articles/create"})
        }
      """
    )
  
    // @LINE:27
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SortieArticleController.update",
      """
        function(idArticle0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/sortie-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:28
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SortieArticleController.delete",
      """
        function(idArticle0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/sortie-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:26
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SortieArticleController.read",
      """
        function(idArticle0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/sortie-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
  }

  // @LINE:119
  class ReversePaiementVenteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.read",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:123
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.update",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:122
    def traiter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.traiter",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/traiter"})
        }
      """
    )
  
    // @LINE:119
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paiement-ventes"})
        }
      """
    )
  
    // @LINE:124
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.delete",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:120
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementVenteController.create",
      """
        function(idParent0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements"})
        }
      """
    )
  
  }

  // @LINE:112
  class ReverseCommandeTransportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:114
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeTransportController.read",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:115
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeTransportController.update",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:112
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeTransportController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "commande-transports"})
        }
      """
    )
  
    // @LINE:116
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeTransportController.delete",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:113
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeTransportController.create",
      """
        function(idParent0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseTafController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def update2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.update2",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:61
    def read2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.read2",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:50
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.read",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:51
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.update",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:52
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.delete",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:48
    def readsByReparation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.readsByReparation",
      """
        function(idParent0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs"})
        }
      """
    )
  
    // @LINE:49
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TafController.create",
      """
        function(idParent0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/tafs"})
        }
      """
    )
  
  }

  // @LINE:105
  class ReverseCommandeVenteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:107
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeVenteController.read",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:108
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeVenteController.update",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:105
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeVenteController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "commande-ventes"})
        }
      """
    )
  
    // @LINE:109
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeVenteController.delete",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:106
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommandeVenteController.create",
      """
        function(idParent0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/commandes"})
        }
      """
    )
  
  }

  // @LINE:177
  class ReverseUtilisateurController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:181
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtilisateurController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "utilisateurs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:178
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtilisateurController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "utilisateurs"})
        }
      """
    )
  
    // @LINE:179
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtilisateurController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "utilisateurs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:180
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtilisateurController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "utilisateurs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:177
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UtilisateurController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "utilisateurs"})
        }
      """
    )
  
  }

  // @LINE:142
  class ReverseDepenseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DepenseController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "depenses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:143
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DepenseController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "depenses"})
        }
      """
    )
  
    // @LINE:144
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DepenseController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "depenses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:145
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DepenseController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "depenses/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:142
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DepenseController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "depenses"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def authentification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.authentification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "connexion"})
        }
      """
    )
  
    // @LINE:8
    def errorServer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.errorServer",
      """
        function(message0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error-server" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("message", message0)])})
        }
      """
    )
  
    // @LINE:3
    def connexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.connexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "connexion"})
        }
      """
    )
  
    // @LINE:7
    def errorClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.errorClient",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error-client"})
        }
      """
    )
  
    // @LINE:5
    def inscription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.inscription",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
        }
      """
    )
  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:4
    def deconnexion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deconnexion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deconnexion"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseBonReparationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:32
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations"})
        }
      """
    )
  
    // @LINE:33
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:36
    def generateBonReparation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.generateBonReparation",
      """
        function(id0,referenceImpressionBonReparation1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionBonReparation", encodeURIComponent(referenceImpressionBonReparation1)) + "/generate"})
        }
      """
    )
  
    // @LINE:34
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:31
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BonReparationController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bon-reparations"})
        }
      """
    )
  
  }

  // @LINE:149
  class ReversePersonnelController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:153
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonnelController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personnels/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:150
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonnelController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "personnels"})
        }
      """
    )
  
    // @LINE:151
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonnelController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personnels/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:152
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonnelController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "personnels/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:149
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonnelController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "personnels"})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseFactureVenteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:81
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes"})
        }
      """
    )
  
    // @LINE:82
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:85
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/edit"})
        }
      """
    )
  
    // @LINE:86
    def generateProforma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.generateProforma",
      """
        function(id0,referenceImpressionFactureVente1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureVente", encodeURIComponent(referenceImpressionFactureVente1)) + "/generate/proforma"})
        }
      """
    )
  
    // @LINE:83
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:87
    def generateDefinitive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.generateDefinitive",
      """
        function(id0,referenceImpressionFactureVente1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionFactureVente", encodeURIComponent(referenceImpressionFactureVente1)) + "/generate/definitive"})
        }
      """
    )
  
    // @LINE:80
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactureVenteController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-ventes"})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseClientTransportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientTransportController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:67
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientTransportController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client-transports"})
        }
      """
    )
  
    // @LINE:68
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientTransportController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:69
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientTransportController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:66
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientTransportController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-transports"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseDemandeTravauxController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:40
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux"})
        }
      """
    )
  
    // @LINE:41
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:42
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/edit"})
        }
      """
    )
  
    // @LINE:45
    def generateDemandeTravaux: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.generateDemandeTravaux",
      """
        function(id0,referenceImpressionDemandeTravaux1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travauxs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionDemandeTravaux", encodeURIComponent(referenceImpressionDemandeTravaux1)) + "/generate"})
        }
      """
    )
  
    // @LINE:43
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:39
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemandeTravauxController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demande-travaux"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseEntreeArticleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntreeArticleController.create",
      """
        function(idArticle0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/entree-articles/create"})
        }
      """
    )
  
    // @LINE:21
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntreeArticleController.update",
      """
        function(idArticle0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/entree-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:22
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntreeArticleController.delete",
      """
        function(idArticle0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/entree-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:20
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EntreeArticleController.read",
      """
        function(idArticle0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idArticle", idArticle0) + "/entree-articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseOrdrePaiementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:56
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements"})
        }
      """
    )
  
    // @LINE:57
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:58
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/edit"})
        }
      """
    )
  
    // @LINE:59
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:63
    def generateOrdrePaiement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.generateOrdrePaiement",
      """
        function(id0,referenceImpressionOrdrePaiement1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reference/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("referenceImpressionOrdrePaiement", encodeURIComponent(referenceImpressionOrdrePaiement1)) + "/generate"})
        }
      """
    )
  
    // @LINE:55
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrdrePaiementController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ordre-paiements"})
        }
      """
    )
  
  }

  // @LINE:184
  class ReverseRapportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:184
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RapportController.download",
      """
        function(folder0,reference1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rapport/download/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("folder", encodeURIComponent(folder0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("reference", encodeURIComponent(reference1))})
        }
      """
    )
  
  }

  // @LINE:127
  class ReversePaiementTransportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.read",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1)})
        }
      """
    )
  
    // @LINE:131
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.update",
      """
        function(idParent0,id1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/update"})
        }
      """
    )
  
    // @LINE:130
    def traiter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.traiter",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/traiter"})
        }
      """
    )
  
    // @LINE:127
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paiement-transports"})
        }
      """
    )
  
    // @LINE:132
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.delete",
      """
        function(idParent0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id1) + "/delete"})
        }
      """
    )
  
    // @LINE:128
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaiementTransportController.create",
      """
        function(idParent0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "facture-transports/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idParent", idParent0) + "/paiements"})
        }
      """
    )
  
  }

  // @LINE:170
  class ReverseSalaireController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:174
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaireController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:171
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaireController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "salaires"})
        }
      """
    )
  
    // @LINE:172
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaireController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:173
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaireController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "salaires/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:170
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaireController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salaires"})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseClientVenteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientVenteController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:74
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientVenteController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client-ventes"})
        }
      """
    )
  
    // @LINE:75
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientVenteController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:76
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientVenteController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "client-ventes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:73
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientVenteController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client-ventes"})
        }
      """
    )
  
  }

  // @LINE:135
  class ReverseCamionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:139
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CamionController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "camions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:136
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CamionController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "camions"})
        }
      """
    )
  
    // @LINE:137
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CamionController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "camions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:138
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CamionController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "camions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:135
    def reads: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CamionController.reads",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "camions"})
        }
      """
    )
  
  }


}
