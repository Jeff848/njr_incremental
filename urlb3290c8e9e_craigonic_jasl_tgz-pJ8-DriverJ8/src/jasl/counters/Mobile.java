// ************************************************************************** //
// Mobile.java - This class is a member of the <B>counters</B> package, which        //
//               contains the class definitions and implementations for       //
//               objects used to represent the virtual playing pieces in      //
//               jASL.                                                        //
//                                                                            //
//               NOTE: This program is based on Advanced Squad Leader, which  //
//                     was created by The Avalon Hill Game Company, and lives //
//                     on at <A HREF="http://www.multimanpublishing.com/Products/tabid/58/CategoryID/4/Default.aspx">Multi-Man Publishing</A>.                            //
//                                                                            //
// Written By: Craig R. Campbell  -  December 1998                            //
// ************************************************************************** //

package jasl.counters;

import jasl.utilities.Messages;

/**
 * This class is used to define the characteristics of units that have the
 * ability to move on their own. It is intended strictly as a superclass, not to
 * be instantiated directly.
 *
 * @version 4.0
 * @author Copyright (C) 1998-2015 Craig R. Campbell (craigonic@gmail.com)
 * @see <A HREF="../../../source/jasl/counters/Mobile.html">Source code</A>
 */

abstract class Mobile extends Fighting implements Mobility
{
	// Private data members

	// This variable contains the movement allowance of the derived object
	// of this class (e.g. "4").

	private int _movement;

	// This variable contains the maximum portage points that the derived
	// object of this class can carry without affecting the number of
	// movement points available to it.

	private int _portageCapacity;

	// This variable contains the current number of portage points of
	// equipment that the derived object of this class is carrying.

	private int _portageLevel;

	// The following string is used as a message for the exception that may
	// be generated by bad data being passed to the constructor.

	private static final String CLASS_NAME = Mobile.class.getSimpleName();

	private static final String invalidArgumentError =
		Messages.buildErrorMessage(CLASS_NAME,Messages.CONSTRUCTOR,
		                           Messages.INVALID_PARAMETER_MSG);

	// Constructor

	// During the instantiation of derived concrete classes the parameters
	// are passed up the inheritance tree from the constructor of the object
	// type being created.

	protected Mobile(Descriptions description,Nationalities nationality,
	                 String unitType,int movement,int portageCapacity)
	{
		// Pass the first 3 parameters to the superclass constructor. If
		// any exceptions are thrown, assume that they will be caught
		// and handled by the program creating the object.

		super(description,nationality,unitType);

		// Check the value of each remaining parameter and copy the
		// value to the local copy of the corresponding variable if an
		// exception is not found.

		// Movement

		if (movement < MIN_MOVEMENT)
		{
			throw new IllegalArgumentException(invalidArgumentError + movement);
		}

		_movement = movement;

		// Portage Capacity

		if (portageCapacity < MIN_PORTAGE_CAPACITY)
		{
			throw new IllegalArgumentException(invalidArgumentError +
			                                   portageCapacity);
		}

		_portageCapacity = portageCapacity;

		// Portage Level

		_portageLevel = MIN_PORTAGE_LEVEL; // Assume that this value
		                                   // will be determined after
		                                   // the object is
		                                   // instantiated.
	}

	// Public access methods

	/**
	 * Display the value of each of the private data members that describe
	 * the current instance. All of the members, beginning with the
	 * top-level class (<B><A HREF="Unit.html">Unit</A></B>) and continuing down the hierarchy to this
	 * level, are appended to the returned string. Each value is preceded by
	 * a label defined in this class or the interface associated with the
	 * item. There are no more than two values, including labels, in each
	 * line of output.
	 *
	 * @return a multi-line tabular <CODE>String</CODE>, 80 characters wide.
	 */

	public String toText()
	{
		// Create a buffer to store the string to be returned,
		// initializing it with the string defined in the parent class
		// version of this method.

		StringBuffer returnString = new StringBuffer(super.toText());

		// Add the information describing the data stored in this class
		// instance.

		// Movement

		returnString.append(Messages.formatTextString(MOVEMENT_LABEL,
		                                              FIRST_COLUMN_LABEL_WIDTH,
		                                              true,false));

		returnString.append(Messages.formatTextString(Integer.toString(movement()),
		                                              SECOND_COLUMN_VALUE_WIDTH,
		                                              false,true));

		// Portage Capacity

		returnString.append(Messages.formatTextString(PORTAGE_CAPACITY_LABEL,
		                                              FIRST_COLUMN_LABEL_WIDTH,
		                                              true,false));

		returnString.append(Messages.formatTextString(Integer.toString(portageCapacity()),
		                                              SECOND_COLUMN_VALUE_WIDTH,
		                                              false,false));

		// Portage Level

		returnString.append(Messages.formatTextString(PORTAGE_LEVEL_LABEL,
		                                              THIRD_COLUMN_LABEL_WIDTH,
		                                              true,false));

		returnString.append(Messages.formatTextString(Integer.toString(portageLevel()),
		                                              FOURTH_COLUMN_VALUE_WIDTH,
		                                              false,true));

		// Return the completed string to calling program.

		return returnString.toString();
	}

	/**
	 * Display the JSON representation each of the private data members that
	 * describe the current instance.
	 *
	 * All of the members, beginning with the top-level class (<B><A HREF="Unit.html">Unit</A></B>) and
	 * continuing down the hierarchy to this level, are appended to the
	 * returned string. Each value is preceded by a label (key) defined in
	 * this class or the interface associated with the item. Entries at each
	 * level are successively indented to provide hierarchical formatting of
	 * the output.
	 *
	 * @return a <CODE>String</CODE> containing the JSON data.
	 */

	public String toJSON()
	{
		// Create a buffer to store the string to be returned,
		// initializing it with the string defined in the parent class
		// version of this method.

		StringBuffer returnString = new StringBuffer(super.toJSON());

		// Add the information describing the data stored in this class
		// instance.

		String INDENT = "   ";

		returnString.append(INDENT +
		                    buildJSONPair(MOVEMENT_LABEL,movement()) +
		                    JSON_OBJECT_SEPARATOR);
		returnString.append(INDENT +
		                    buildJSONPair(PORTAGE_CAPACITY_LABEL,portageCapacity()) +
		                    JSON_OBJECT_SEPARATOR);
		returnString.append(INDENT +
		                    buildJSONPair(PORTAGE_LEVEL_LABEL,portageLevel()) +
		                    JSON_OBJECT_SEPARATOR);

		// Return the completed string to calling program.

		return returnString.toString();
	}

	/**
	 * Return the number of movement factors or points available to a unit
	 * before it begins to move.
	 *
	 * This value does not include the effect, if any, of the current
	 * portage level of the unit.
	 *
	 * @return an <CODE>int</CODE> specifying the movement capability of the
	 * unit in factors or points.
	 */

	public final int movement()
	{
		return _movement;
	}

	/**
	 * Return the maximum number of portage points (PP) of personnel and/or
	 * equipment that a unit can carry without affecting the movement
	 * factors or points available to it.
	 *
	 * @return an <CODE>int</CODE> specifying the portage capacity of the unit.
	 */

	public final int portageCapacity()
	{
		return _portageCapacity;
	}

	/**
	 * Return the number of portage points (PP) of personnel and/or
	 * equipment that a unit is currently carrying.
	 *
	 * @return an <CODE>int</CODE> specifying the current portage level of the unit.
	 */

	public final int portageLevel()
	{
		return _portageLevel;
	}

	// Update methods

	/**
	 * Set the number of portage points (PP) of personnel and/or equipment
	 * that a unit is currently carrying.
	 *
	 * @param portageLevel the new portage level for the unit.
	 *
	 * @throws IllegalArgumentException in the case of a new level less than
	 * zero.
	 */

	public final void setPortageLevel(int portageLevel)
	{
		if (portageLevel < MIN_PORTAGE_LEVEL)
		{
			throw new IllegalArgumentException(Messages.buildErrorMessage(CLASS_NAME,
			                                                              "setPortageLevel",
			                                                              Messages.INVALID_PARAMETER_MSG + portageLevel));
		}

		_portageLevel = portageLevel;
	}
}
