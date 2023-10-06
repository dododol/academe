package kr.or.ddit.file.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class StandardMultipartFile implements MultipartFile{
   
   private Part adaptee;
         

   public StandardMultipartFile(Part adaptee) {
      super();
      this.adaptee = adaptee;
   }

   @Override
   public byte[] getBytes() throws IOException {
      return IOUtils.toByteArray(getInputStream());
   }

   @Override
   public String getContentType() {
      return adaptee.getContentType();
   }

   @Override
   public InputStream getInputStream() throws IOException {
      // TODO Auto-generated method stub
      return getInputStream();
   }

   @Override
   public String getName() {
      return adaptee.getName();
   }

   @Override
   public String getOriginalFilename() {
      // TODO Auto-generated method stub
      return adaptee.getSubmittedFileName();
   }

   @Override
   public long getSize() {
      // TODO Auto-generated method stub
      return adaptee.getSize();
   }

   @Override
   public boolean isEmpty() {
      return StringUtils.isBlank(getOriginalFilename());
   }

   @Override
   public void transferTo(File dest) throws IOException {
      // TODO Auto-generated method stub
      adaptee.write(dest.getCanonicalPath());
   }

}