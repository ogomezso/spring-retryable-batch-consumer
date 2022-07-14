/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.github.ogomezso.springretryablebatchconsumer.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Users extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7193454889850137762L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Users\",\"namespace\":\"org.github.ogomezso.springretryablebatchconsumer.model\",\"fields\":[{\"name\":\"registertime\",\"type\":{\"type\":\"long\",\"arg.properties\":{\"range\":{\"min\":1487715775521,\"max\":1519273364600}}}},{\"name\":\"userid\",\"type\":{\"type\":\"string\",\"arg.properties\":{\"regex\":\"User_[1-9]\"}}},{\"name\":\"regionid\",\"type\":{\"type\":\"string\",\"arg.properties\":{\"regex\":\"Region_[1-9]\"}}},{\"name\":\"gender\",\"type\":{\"type\":\"string\",\"arg.properties\":{\"options\":[\"MALE\",\"FEMALE\",\"OTHER\"]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Users> ENCODER =
      new BinaryMessageEncoder<Users>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Users> DECODER =
      new BinaryMessageDecoder<Users>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Users> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Users> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Users> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Users>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Users to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Users from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Users instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Users fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long registertime;
  private java.lang.CharSequence userid;
  private java.lang.CharSequence regionid;
  private java.lang.CharSequence gender;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Users() {}

  /**
   * All-args constructor.
   * @param registertime The new value for registertime
   * @param userid The new value for userid
   * @param regionid The new value for regionid
   * @param gender The new value for gender
   */
  public Users(java.lang.Long registertime, java.lang.CharSequence userid, java.lang.CharSequence regionid, java.lang.CharSequence gender) {
    this.registertime = registertime;
    this.userid = userid;
    this.regionid = regionid;
    this.gender = gender;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return registertime;
    case 1: return userid;
    case 2: return regionid;
    case 3: return gender;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: registertime = (java.lang.Long)value$; break;
    case 1: userid = (java.lang.CharSequence)value$; break;
    case 2: regionid = (java.lang.CharSequence)value$; break;
    case 3: gender = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'registertime' field.
   * @return The value of the 'registertime' field.
   */
  public long getRegistertime() {
    return registertime;
  }


  /**
   * Sets the value of the 'registertime' field.
   * @param value the value to set.
   */
  public void setRegistertime(long value) {
    this.registertime = value;
  }

  /**
   * Gets the value of the 'userid' field.
   * @return The value of the 'userid' field.
   */
  public java.lang.CharSequence getUserid() {
    return userid;
  }


  /**
   * Sets the value of the 'userid' field.
   * @param value the value to set.
   */
  public void setUserid(java.lang.CharSequence value) {
    this.userid = value;
  }

  /**
   * Gets the value of the 'regionid' field.
   * @return The value of the 'regionid' field.
   */
  public java.lang.CharSequence getRegionid() {
    return regionid;
  }


  /**
   * Sets the value of the 'regionid' field.
   * @param value the value to set.
   */
  public void setRegionid(java.lang.CharSequence value) {
    this.regionid = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public java.lang.CharSequence getGender() {
    return gender;
  }


  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.CharSequence value) {
    this.gender = value;
  }

  /**
   * Creates a new Users RecordBuilder.
   * @return A new Users RecordBuilder
   */
  public static org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder newBuilder() {
    return new org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder();
  }

  /**
   * Creates a new Users RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Users RecordBuilder
   */
  public static org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder newBuilder(org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder other) {
    if (other == null) {
      return new org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder();
    } else {
      return new org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder(other);
    }
  }

  /**
   * Creates a new Users RecordBuilder by copying an existing Users instance.
   * @param other The existing instance to copy.
   * @return A new Users RecordBuilder
   */
  public static org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder newBuilder(org.github.ogomezso.springretryablebatchconsumer.model.Users other) {
    if (other == null) {
      return new org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder();
    } else {
      return new org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder(other);
    }
  }

  /**
   * RecordBuilder for Users instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Users>
    implements org.apache.avro.data.RecordBuilder<Users> {

    private long registertime;
    private java.lang.CharSequence userid;
    private java.lang.CharSequence regionid;
    private java.lang.CharSequence gender;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.registertime)) {
        this.registertime = data().deepCopy(fields()[0].schema(), other.registertime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.regionid)) {
        this.regionid = data().deepCopy(fields()[2].schema(), other.regionid);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.gender)) {
        this.gender = data().deepCopy(fields()[3].schema(), other.gender);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Users instance
     * @param other The existing instance to copy.
     */
    private Builder(org.github.ogomezso.springretryablebatchconsumer.model.Users other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.registertime)) {
        this.registertime = data().deepCopy(fields()[0].schema(), other.registertime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.regionid)) {
        this.regionid = data().deepCopy(fields()[2].schema(), other.regionid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gender)) {
        this.gender = data().deepCopy(fields()[3].schema(), other.gender);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'registertime' field.
      * @return The value.
      */
    public long getRegistertime() {
      return registertime;
    }


    /**
      * Sets the value of the 'registertime' field.
      * @param value The value of 'registertime'.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder setRegistertime(long value) {
      validate(fields()[0], value);
      this.registertime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'registertime' field has been set.
      * @return True if the 'registertime' field has been set, false otherwise.
      */
    public boolean hasRegistertime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'registertime' field.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder clearRegistertime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userid' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserid() {
      return userid;
    }


    /**
      * Sets the value of the 'userid' field.
      * @param value The value of 'userid'.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder setUserid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.userid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userid' field has been set.
      * @return True if the 'userid' field has been set, false otherwise.
      */
    public boolean hasUserid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userid' field.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder clearUserid() {
      userid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'regionid' field.
      * @return The value.
      */
    public java.lang.CharSequence getRegionid() {
      return regionid;
    }


    /**
      * Sets the value of the 'regionid' field.
      * @param value The value of 'regionid'.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder setRegionid(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.regionid = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'regionid' field has been set.
      * @return True if the 'regionid' field has been set, false otherwise.
      */
    public boolean hasRegionid() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'regionid' field.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder clearRegionid() {
      regionid = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public java.lang.CharSequence getGender() {
      return gender;
    }


    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder setGender(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.gender = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public org.github.ogomezso.springretryablebatchconsumer.model.Users.Builder clearGender() {
      gender = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Users build() {
      try {
        Users record = new Users();
        record.registertime = fieldSetFlags()[0] ? this.registertime : (java.lang.Long) defaultValue(fields()[0]);
        record.userid = fieldSetFlags()[1] ? this.userid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.regionid = fieldSetFlags()[2] ? this.regionid : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.gender = fieldSetFlags()[3] ? this.gender : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Users>
    WRITER$ = (org.apache.avro.io.DatumWriter<Users>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Users>
    READER$ = (org.apache.avro.io.DatumReader<Users>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.registertime);

    out.writeString(this.userid);

    out.writeString(this.regionid);

    out.writeString(this.gender);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.registertime = in.readLong();

      this.userid = in.readString(this.userid instanceof Utf8 ? (Utf8)this.userid : null);

      this.regionid = in.readString(this.regionid instanceof Utf8 ? (Utf8)this.regionid : null);

      this.gender = in.readString(this.gender instanceof Utf8 ? (Utf8)this.gender : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.registertime = in.readLong();
          break;

        case 1:
          this.userid = in.readString(this.userid instanceof Utf8 ? (Utf8)this.userid : null);
          break;

        case 2:
          this.regionid = in.readString(this.regionid instanceof Utf8 ? (Utf8)this.regionid : null);
          break;

        case 3:
          this.gender = in.readString(this.gender instanceof Utf8 ? (Utf8)this.gender : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









