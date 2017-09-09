package com.platzi.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {
	private Session session;
	
	public PlatziSession() {
        //se encarga de leer el archivo de configuracion de hibernate
        Configuration configuration = new Configuration();
        //inicia la configuracion de la sesion de nuestra bd
        configuration.configure();
        SessionFactory sessionFactory;
        //abre la puerta
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
	}

	public Session getSession() {
        
        return session;
	}
}
