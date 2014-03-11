/*******************************************************************************
 * Copyright (c) 2011, 2012 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/
package org.eclipse.rap.examples.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.examples.IExampleContribution;
import org.eclipse.rap.examples.pages.internal.Contributions;


public final class ExampleContributionsTracker
{
	private final Map<String, IExampleContribution> contributions;
	
	public ExampleContributionsTracker()
	{
		this.contributions = new HashMap<String, IExampleContribution>();
		for(IExampleContribution contribution : new Contributions().getContibutions())
		{
			this.contributions.put(contribution.getId(), contribution);
		}
		
	}

  public Collection<String> getContributionIds() {
    return contributions.keySet();
  }

  public IExampleContribution getContribution( String id ) {
    return contributions.get(id);
  }
}
