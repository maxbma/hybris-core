/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10 окт. 2021 г., 15:24:25                   ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type ItemWithToken.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class ItemWithToken extends GenericItem
{
	/** Qualifier of the <code>ItemWithToken.token</code> attribute **/
	public static final String TOKEN = "token";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TOKEN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithToken.token</code> attribute.
	 * @return the token
	 */
	public String getToken(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "token".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithToken.token</code> attribute.
	 * @return the token
	 */
	public String getToken()
	{
		return getToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithToken.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "token".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithToken.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final String value)
	{
		setToken( getSession().getSessionContext(), value );
	}
	
}
