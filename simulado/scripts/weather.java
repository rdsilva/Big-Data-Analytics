// ORM class for table 'weather'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Oct 26 19:17:54 UTC 2018
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class weather extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("station", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        station = (String)value;
      }
    });
    setters.put("year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        year = (Integer)value;
      }
    });
    setters.put("month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        month = (Integer)value;
      }
    });
    setters.put("dayofmonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dayofmonth = (Integer)value;
      }
    });
    setters.put("precipitation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        precipitation = (Integer)value;
      }
    });
    setters.put("maxtemp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        maxtemp = (Integer)value;
      }
    });
    setters.put("mintemp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        mintemp = (Integer)value;
      }
    });
  }
  public weather() {
    init0();
  }
  private String station;
  public String get_station() {
    return station;
  }
  public void set_station(String station) {
    this.station = station;
  }
  public weather with_station(String station) {
    this.station = station;
    return this;
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public weather with_year(Integer year) {
    this.year = year;
    return this;
  }
  private Integer month;
  public Integer get_month() {
    return month;
  }
  public void set_month(Integer month) {
    this.month = month;
  }
  public weather with_month(Integer month) {
    this.month = month;
    return this;
  }
  private Integer dayofmonth;
  public Integer get_dayofmonth() {
    return dayofmonth;
  }
  public void set_dayofmonth(Integer dayofmonth) {
    this.dayofmonth = dayofmonth;
  }
  public weather with_dayofmonth(Integer dayofmonth) {
    this.dayofmonth = dayofmonth;
    return this;
  }
  private Integer precipitation;
  public Integer get_precipitation() {
    return precipitation;
  }
  public void set_precipitation(Integer precipitation) {
    this.precipitation = precipitation;
  }
  public weather with_precipitation(Integer precipitation) {
    this.precipitation = precipitation;
    return this;
  }
  private Integer maxtemp;
  public Integer get_maxtemp() {
    return maxtemp;
  }
  public void set_maxtemp(Integer maxtemp) {
    this.maxtemp = maxtemp;
  }
  public weather with_maxtemp(Integer maxtemp) {
    this.maxtemp = maxtemp;
    return this;
  }
  private Integer mintemp;
  public Integer get_mintemp() {
    return mintemp;
  }
  public void set_mintemp(Integer mintemp) {
    this.mintemp = mintemp;
  }
  public weather with_mintemp(Integer mintemp) {
    this.mintemp = mintemp;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather)) {
      return false;
    }
    weather that = (weather) o;
    boolean equal = true;
    equal = equal && (this.station == null ? that.station == null : this.station.equals(that.station));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.dayofmonth == null ? that.dayofmonth == null : this.dayofmonth.equals(that.dayofmonth));
    equal = equal && (this.precipitation == null ? that.precipitation == null : this.precipitation.equals(that.precipitation));
    equal = equal && (this.maxtemp == null ? that.maxtemp == null : this.maxtemp.equals(that.maxtemp));
    equal = equal && (this.mintemp == null ? that.mintemp == null : this.mintemp.equals(that.mintemp));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather)) {
      return false;
    }
    weather that = (weather) o;
    boolean equal = true;
    equal = equal && (this.station == null ? that.station == null : this.station.equals(that.station));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.dayofmonth == null ? that.dayofmonth == null : this.dayofmonth.equals(that.dayofmonth));
    equal = equal && (this.precipitation == null ? that.precipitation == null : this.precipitation.equals(that.precipitation));
    equal = equal && (this.maxtemp == null ? that.maxtemp == null : this.maxtemp.equals(that.maxtemp));
    equal = equal && (this.mintemp == null ? that.mintemp == null : this.mintemp.equals(that.mintemp));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.station = JdbcWritableBridge.readString(1, __dbResults);
    this.year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.month = JdbcWritableBridge.readInteger(3, __dbResults);
    this.dayofmonth = JdbcWritableBridge.readInteger(4, __dbResults);
    this.precipitation = JdbcWritableBridge.readInteger(5, __dbResults);
    this.maxtemp = JdbcWritableBridge.readInteger(6, __dbResults);
    this.mintemp = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.station = JdbcWritableBridge.readString(1, __dbResults);
    this.year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.month = JdbcWritableBridge.readInteger(3, __dbResults);
    this.dayofmonth = JdbcWritableBridge.readInteger(4, __dbResults);
    this.precipitation = JdbcWritableBridge.readInteger(5, __dbResults);
    this.maxtemp = JdbcWritableBridge.readInteger(6, __dbResults);
    this.mintemp = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(station, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(month, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dayofmonth, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(precipitation, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(maxtemp, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mintemp, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(station, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(month, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dayofmonth, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(precipitation, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(maxtemp, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mintemp, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.station = null;
    } else {
    this.station = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.month = null;
    } else {
    this.month = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dayofmonth = null;
    } else {
    this.dayofmonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.precipitation = null;
    } else {
    this.precipitation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.maxtemp = null;
    } else {
    this.maxtemp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mintemp = null;
    } else {
    this.mintemp = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.month);
    }
    if (null == this.dayofmonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dayofmonth);
    }
    if (null == this.precipitation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.precipitation);
    }
    if (null == this.maxtemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maxtemp);
    }
    if (null == this.mintemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mintemp);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.month);
    }
    if (null == this.dayofmonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dayofmonth);
    }
    if (null == this.precipitation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.precipitation);
    }
    if (null == this.maxtemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maxtemp);
    }
    if (null == this.mintemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mintemp);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(station==null?"null":station, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":"" + month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dayofmonth==null?"null":"" + dayofmonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precipitation==null?"null":"" + precipitation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maxtemp==null?"null":"" + maxtemp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mintemp==null?"null":"" + mintemp, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(station==null?"null":station, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":"" + month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dayofmonth==null?"null":"" + dayofmonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precipitation==null?"null":"" + precipitation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maxtemp==null?"null":"" + maxtemp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mintemp==null?"null":"" + mintemp, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.station = null; } else {
      this.station = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.month = null; } else {
      this.month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dayofmonth = null; } else {
      this.dayofmonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precipitation = null; } else {
      this.precipitation = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maxtemp = null; } else {
      this.maxtemp = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mintemp = null; } else {
      this.mintemp = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.station = null; } else {
      this.station = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.month = null; } else {
      this.month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dayofmonth = null; } else {
      this.dayofmonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precipitation = null; } else {
      this.precipitation = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maxtemp = null; } else {
      this.maxtemp = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mintemp = null; } else {
      this.mintemp = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    weather o = (weather) super.clone();
    return o;
  }

  public void clone0(weather o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("station", this.station);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("dayofmonth", this.dayofmonth);
    __sqoop$field_map.put("precipitation", this.precipitation);
    __sqoop$field_map.put("maxtemp", this.maxtemp);
    __sqoop$field_map.put("mintemp", this.mintemp);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("station", this.station);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("dayofmonth", this.dayofmonth);
    __sqoop$field_map.put("precipitation", this.precipitation);
    __sqoop$field_map.put("maxtemp", this.maxtemp);
    __sqoop$field_map.put("mintemp", this.mintemp);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
