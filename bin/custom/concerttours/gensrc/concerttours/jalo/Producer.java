/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 18 окт. 2021 г., 18:09:08                   ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type Producer.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Producer extends GenericItem
{
	/** Qualifier of the <code>Producer.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Producer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Producer.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Producer.tours</code> attribute **/
	public static final String TOURS = "tours";
	/**
	* {@link OneToManyHandler} for handling 1:n TOURS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> TOURSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"producer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "code".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "code".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "firstName".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "firstName".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "surname".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "surname".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.tours</code> attribute.
	 * @return the tours
	 */
	public Set<Product> getTours(final SessionContext ctx)
	{
		return (Set<Product>)TOURSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Producer.tours</code> attribute.
	 * @return the tours
	 */
	public Set<Product> getTours()
	{
		return getTours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.tours</code> attribute. 
	 * @param value the tours
	 */
	public void setTours(final SessionContext ctx, final Set<Product> value)
	{
		TOURSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Producer.tours</code> attribute. 
	 * @param value the tours
	 */
	public void setTours(final Set<Product> value)
	{
		setTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tours. 
	 * @param value the item to add to tours
	 */
	public void addToTours(final SessionContext ctx, final Product value)
	{
		TOURSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tours. 
	 * @param value the item to add to tours
	 */
	public void addToTours(final Product value)
	{
		addToTours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tours. 
	 * @param value the item to remove from tours
	 */
	public void removeFromTours(final SessionContext ctx, final Product value)
	{
		TOURSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tours. 
	 * @param value the item to remove from tours
	 */
	public void removeFromTours(final Product value)
	{
		removeFromTours( getSession().getSessionContext(), value );
	}
	
}
