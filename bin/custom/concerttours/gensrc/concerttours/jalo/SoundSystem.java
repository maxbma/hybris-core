/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12 окт. 2021 г., 11:18:15                   ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type SoundSystem.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class SoundSystem extends GenericItem
{
	/** Qualifier of the <code>SoundSystem.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SoundSystem.speakerAmount</code> attribute **/
	public static final String SPEAKERAMOUNT = "speakerAmount";
	/** Qualifier of the <code>SoundSystem.speakerType</code> attribute **/
	public static final String SPEAKERTYPE = "speakerType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SPEAKERAMOUNT, AttributeMode.INITIAL);
		tmp.put(SPEAKERTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.code</code> attribute.
	 * @return the code - unique code of sond system
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "code".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.code</code> attribute.
	 * @return the code - unique code of sond system
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.code</code> attribute. 
	 * @param value the code - unique code of sond system
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "code".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.code</code> attribute. 
	 * @param value the code - unique code of sond system
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerAmount</code> attribute.
	 * @return the speakerAmount
	 */
	public Integer getSpeakerAmount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "speakerAmount".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerAmount</code> attribute.
	 * @return the speakerAmount
	 */
	public Integer getSpeakerAmount()
	{
		return getSpeakerAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @return the speakerAmount
	 */
	public int getSpeakerAmountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSpeakerAmount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @return the speakerAmount
	 */
	public int getSpeakerAmountAsPrimitive()
	{
		return getSpeakerAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @param value the speakerAmount
	 */
	public void setSpeakerAmount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "speakerAmount".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @param value the speakerAmount
	 */
	public void setSpeakerAmount(final Integer value)
	{
		setSpeakerAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @param value the speakerAmount
	 */
	public void setSpeakerAmount(final SessionContext ctx, final int value)
	{
		setSpeakerAmount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerAmount</code> attribute. 
	 * @param value the speakerAmount
	 */
	public void setSpeakerAmount(final int value)
	{
		setSpeakerAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerType</code> attribute.
	 * @return the speakerType
	 */
	public EnumerationValue getSpeakerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "speakerType".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SoundSystem.speakerType</code> attribute.
	 * @return the speakerType
	 */
	public EnumerationValue getSpeakerType()
	{
		return getSpeakerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerType</code> attribute. 
	 * @param value the speakerType
	 */
	public void setSpeakerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "speakerType".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SoundSystem.speakerType</code> attribute. 
	 * @param value the speakerType
	 */
	public void setSpeakerType(final EnumerationValue value)
	{
		setSpeakerType( getSession().getSessionContext(), value );
	}
	
}
