package org.nlogo.extensions.java.classes;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.DefaultReporter;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;

/**
 *
 * @author Martyn Lloyd-Kelly <martynlk@liverpool.ac.uk>
 */
public class GetCanonicalName extends DefaultReporter {

  @Override
  public Syntax getSyntax(){
    return Syntax.reporterSyntax(new int[]{Syntax.WildcardType()}, Syntax.StringType());
  }
  
  /**
   * 
   * @param args Any {@link java.lang.Object}.
   * @param context
   * 
   * @return The result of invoking {@link java.lang.Class#getCanonicalName()} 
   * on the {@link java.lang.Object} passed as a parameter.
   * 
   * @throws ExtensionException
   * @throws LogoException 
   */
  @Override
  public Object report(Argument[] args, Context context) throws ExtensionException, LogoException {
    return args[0].get().getClass().getCanonicalName();
  }
  
}
