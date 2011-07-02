package controllers

import play._
import play.mvc._

object Site extends Controller {
    
    import views.Site._
    
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
