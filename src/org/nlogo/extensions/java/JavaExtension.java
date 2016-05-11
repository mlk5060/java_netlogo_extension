package org.nlogo.extensions.java;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.PrimitiveManager;

/**
 * Provides useful Java-centric functionality for Netlogo.
 * 
 * @author Martyn Lloyd-Kelly <martynlk@liverpool.ac.uk>
 */
public class JavaExtension extends DefaultClassManager{

  @Override
  public void load(PrimitiveManager pm) throws ExtensionException {
    pm.addPrimitive("Class.get-canonical-name", new org.nlogo.extensions.java.classes.GetCanonicalName());
  }
  
}
