package com.main.ergasia;

import java.util.ArrayList;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("DVD")
public class MyResource {
private Repository rep=new Repository();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("getDVDs")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<DVD> getDVD() {
        return rep.getDVDs();
    }
    @GET
    @Path("search/{pinakas}")
    public ArrayList get(@PathParam("pinakas") String pinakas ) {
    	return rep.searchIn(pinakas);
    }
    
    @POST
    @Path("newDVD")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addDvd(DVD dvd){
    	rep.addDvd(dvd);
    }
    @POST
    @Path("newH8")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addH8opoios(H8opoios h8opoios){
    	rep.addH8opoios(h8opoios);
    }
    @POST
    @Path("newHasDvd")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addHasDvd(HasDVD hasDvd){
    	rep.addHasDVD(hasDvd);
    }
    @POST
    @Path("newHasH8opoious")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addDvd(HasH8opoious hh){
    	rep.addHasH8opoious(hh);
    }
    @POST
    @Path("newHasLanguage")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addHasLanguage(HasLanguage hasLanguage){
    	rep.addHasLanguage(hasLanguage);
    }
    @POST
    @Path("newLanguage")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLanguage(Language language){
    	rep.addLanguage(language);
    }
    @POST
    @Path("newOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order){
    	rep.addOrder(order);
    }
    @POST
    @Path("newPelatis")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPelatis(Pelatis pelatis){
    	rep.addPelatis(pelatis);
    }
    @POST
    @Path("newPurchaseCard")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPurchaseCard(PurchaseCard purchaseCard){
    	rep.addPurchaseCard(purchaseCard);
    }
    @POST
    @Path("newUser")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser(User user){
    	rep.addUser(user);
    }
    @POST
    @Path("newUser")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addYpallhlos(Ypallhlos yp){
    	rep.addUser(yp);
    }
}
