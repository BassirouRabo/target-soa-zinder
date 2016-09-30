
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brabo/IdeaProjects/hydrocarbure-transport/conf/routes
// @DATE:Fri Sep 30 01:30:41 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
