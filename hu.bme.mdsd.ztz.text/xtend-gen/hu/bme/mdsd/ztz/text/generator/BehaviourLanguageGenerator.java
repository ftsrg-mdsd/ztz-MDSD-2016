/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.generator;

import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.manager.ResourceManager;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BehaviourLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final ResourceManager manager = ResourceManager.getInstance();
    this.importResource(resource, manager);
    this.generateBehaviour(resource, fsa);
  }
  
  protected void generateBehaviour(final Resource resource, final IFileSystemAccess2 fsa) {
    try {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      final Iterator<BehaviourContainer> containerIterator = Iterators.<BehaviourContainer>filter(_allContents, BehaviourContainer.class);
      boolean _hasNext = containerIterator.hasNext();
      if (_hasNext) {
        final BehaviourContainer container = containerIterator.next();
        final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        final Map<String, Object> m = reg.getExtensionToFactoryMap();
        XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
        m.put("behaviour", _xMIResourceFactoryImpl);
        final ResourceSet resourceSet = new ResourceSetImpl();
        ResourceManager _instance = ResourceManager.getInstance();
        String _modelFolder = _instance.getModelFolder();
        String _plus = (_modelFolder + "robots.behaviour");
        final URI resourceURI = fsa.getURI(_plus);
        final Resource resourceOfBehaviour = resourceSet.createResource(resourceURI);
        EList<EObject> _contents = resourceOfBehaviour.getContents();
        _contents.clear();
        EList<EObject> _contents_1 = resourceOfBehaviour.getContents();
        _contents_1.add(container);
        resourceOfBehaviour.save(null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Resource importResource(final Resource resource, final ResourceManager manager) {
    Resource _xblockexpression = null;
    {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      final Iterator<Import> iterator = Iterators.<Import>filter(_allContents, Import.class);
      Resource _xifexpression = null;
      boolean _hasNext = iterator.hasNext();
      if (_hasNext) {
        Resource _xblockexpression_1 = null;
        {
          final Import imp = iterator.next();
          Resource _xifexpression_1 = null;
          String _importURI = imp.getImportURI();
          boolean _isEmpty = _importURI.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            Resource _xifexpression_2 = null;
            String _importedModelPath = manager.getImportedModelPath();
            String _importURI_1 = imp.getImportURI();
            boolean _equals = _importedModelPath.equals(_importURI_1);
            boolean _not_1 = (!_equals);
            if (_not_1) {
              _xifexpression_2 = manager.load(imp);
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
