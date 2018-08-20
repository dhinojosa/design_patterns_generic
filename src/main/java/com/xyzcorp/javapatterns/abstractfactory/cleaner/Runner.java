package com.xyzcorp.javapatterns.abstractfactory.cleaner;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:31 PM
 */
public class Runner {

    public static void main(String[] args) {

        RegistrationDAO registrationDAO = new RegistrationDAOCompositeFactory().create();
        registrationDAO.persist(new Registration());

    }
}
