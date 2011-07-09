package controllers

import play._
import play.mvc._
import play.mvc.results._
import play.modules.gae._

object Site extends ScalaController {
    
    import views.Site._
    
    def login (openid:String = "") = {
    	import com.google.appengine.api.users.UserServiceFactory
    	import java.util.HashSet
    	
    	val us = UserServiceFactory getUserService
    	val user = us.getCurrentUser
    	
    	if (openid != "") {
    		val loginUrl = us.createLoginURL("/", null, openid, new HashSet[String])
    		//new Redirect(loginUrl)
    		
    		//loginUrl
    		new Redirect(loginUrl)
    	} else {
	    	
	    	println(user)
	    	
	    	html.login()
    	}
    }
    
    def index = {
        html.index()
    }
    
    def calendar = {
    	html.calendar()
    }
    
    def presentations = {
    	html.presentations()
    }
    
    def sponsors = {
    	html.sponsors()
    }
    
    def aboutus = {
    	html.aboutus()
    }
    
}
