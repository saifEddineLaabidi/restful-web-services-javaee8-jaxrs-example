package resources;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.Achat;

@Path("achats")
public class AchatResource {

	static List<Achat> achats = new ArrayList<Achat>();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Achat> getAll() {
		return achats;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addAchat(Achat achat) {
		achats.add(achat);
		return "Achat ajouté";
	}
	
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Achat searchAchat(@QueryParam("ref") int ref) {

		for (Achat e : achats) {
			if (e.getRef() == ref)
				return e;
		}
		return null;
	}
	
	@GET
	@Path("/search/{ref}")
	@Produces(MediaType.APPLICATION_JSON)
	public Achat searchAchatParam(@PathParam("ref") int ref) {

		for (Achat e : achats) {
			if (e.getRef() == ref)
				return e;
		}
		return null;
	}
	
	
	@DELETE
	@Path("/delete")
	public void deleteAchat(@QueryParam("id") int ref) {

		Iterator<Achat> it = achats.iterator();

		while (it.hasNext()) {
			if (it.next().getRef() == ref){
				it.remove();
				return;
			}
		}
	}
}