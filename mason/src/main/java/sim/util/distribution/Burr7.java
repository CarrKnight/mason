/*
  Copyright 2021 by Sean Luke and George Mason University
  Licensed under the Academic Free License version 3.0
  See the file "LICENSE" for more information
*/

package sim.util.distribution;
import ec.util.MersenneTwisterFast;

/** This stub class simply calls the equivalent function in Distributions.java */

public class Burr7 extends AbstractContinuousDistribution
	{
	double r;
	MersenneTwisterFast random;
	
	public Burr7(double r, MersenneTwisterFast random)
		{
		this.r = r;
		this.random = random;
		}
	
	public double nextDouble()
		{
		// yes, *Burr1*
		return Distributions.nextBurr1(r, 7, random);
		}
	}