package mx.com.cuervo.transporte.fileentries.service.api;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;

/**
 * @author Jonathan
 */
public interface FileEntriesCuervoTransporteService {
	
	/**
	 * Metodo utilizado para obtener el id del archivo a buscar
	 * @param folderName nombre del folder donde se buscara
	 * @param fileName nombre del archivo
	 * @param themeDisplay objeto ThemeDisplay con propiedades del portal
	 * @return long  el id del archivo
	 */
	 long getFileId(String folderName, String fileName, ThemeDisplay themeDisplay);
	 
	 public String getUrlFile(ThemeDisplay themeDisplay, DLFileEntry fileEntry);
}