package it.polito.tdp.extflightdelays.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;


import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {
	
	private Graph<Airport, DefaultWeightedEdge> grafo;
	private List<Adiacenza> archi;
	private Map<Integer, Airport> vertici;
	
	public Model() {
		
		this.archi = new ArrayList<>();
		this.vertici = new HashMap<>();
	}
	
	public void creaGrafo(int media) {
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		ExtFlightDelaysDAO dao = new ExtFlightDelaysDAO();
		
		this.vertici = dao.loadAllAirports();
		Graphs.addAllVertices(this.grafo, this.vertici.values());
		
		this.archi = dao.listaAdiacenze(media);
		for(Adiacenza a : archi) {
			Graphs.addEdge(this.grafo, this.vertici.get(a.getIdPartenza()), this.vertici.get(a.getIdArrivo()), a.getMediaVolo());
		}
	}
	
	public int nVertici() {
		return this.grafo.vertexSet().size();
	}
	
	public int nArchi() {
		return this.grafo.edgeSet().size();
	}
	
	public String stampaGrafo() {
		String s = "";
		for(Adiacenza a : archi) {
			s += vertici.get(a.getIdPartenza()).getId() + "-" + vertici.get(a.getIdArrivo()).getId() + " " + a.getMediaVolo() + "\n";
		}
		return s;
	}

}
