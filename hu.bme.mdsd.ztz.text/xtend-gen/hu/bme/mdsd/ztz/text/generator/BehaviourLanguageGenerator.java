/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.generator;

import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.manager.ResourceManager;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BehaviourLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Iterator<Import> iterator = Iterators.<Import>filter(_allContents, Import.class);
    boolean _hasNext = iterator.hasNext();
    if (_hasNext) {
      final Import imp = iterator.next();
      String _importURI = imp.getImportURI();
      boolean _isEmpty = _importURI.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final ResourceManager manager = ResourceManager.getInstance();
        String _importedModelPath = manager.getImportedModelPath();
        String _importURI_1 = imp.getImportURI();
        boolean _equals = _importedModelPath.equals(_importURI_1);
        boolean _not_1 = (!_equals);
        if (_not_1) {
          String _importURI_2 = imp.getImportURI();
          String _plus = ("../model/" + _importURI_2);
          final URI modelPathUri = fsa.getURI(_plus);
          manager.load(modelPathUri);
          String _importURI_3 = imp.getImportURI();
          manager.setImportedModelPath(_importURI_3);
        }
      }
    }
  }
}
