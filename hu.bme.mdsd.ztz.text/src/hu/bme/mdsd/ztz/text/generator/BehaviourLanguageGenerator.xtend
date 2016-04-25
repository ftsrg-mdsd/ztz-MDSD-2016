/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.generator

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.manager.ResourceManager
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import org.eclipse.xtend.lib.annotations.Delegate

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BehaviourLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val manager = ResourceManager.instance
		importResource(resource, manager)
		
		generateBehaviour(resource, fsa)
	}
	
	protected def generateBehaviour(Resource resource, IFileSystemAccess2 fsa) {
		val Iterator<BehaviourContainer> containerIterator = resource.allContents.filter(typeof(BehaviourContainer))
		if (containerIterator.hasNext) {
			val container = containerIterator.next()
			
			val Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
		    		val Map<String, Object> m = reg.getExtensionToFactoryMap()
		    		m.put("behaviour", new XMIResourceFactoryImpl())
			
			val ResourceSet resourceSet = new ResourceSetImpl();
		
			val resourceURI = fsa.getURI(ResourceManager.instance.modelFolder + "robots.behaviour")
		
			val resourceOfBehaviour = resourceSet.createResource(resourceURI)
			resourceOfBehaviour.getContents().clear()
		
			resourceOfBehaviour.getContents().add(container)
			
			parseStatements(resource, resourceOfBehaviour)
			
			resourceOfBehaviour.save(null)
		}
	}
	
	protected def parseStatements(Resource resource, Resource resourceOfBehaviour) {
		val Iterator<Statement> statementIter = resource.allContents.filter(typeof(Statement))
		
		while(statementIter.hasNext) {
			val statement = statementIter.next()
			statement.parseStatement(resourceOfBehaviour)
		}
	}
	
	def dispatch parseStatement(ActionStatement statement, Resource resourceOfBehaviour) {
		statement.robot.actions.add(statement.action)
	}
	
	def dispatch parseStatement(MessageStatement statement, Resource resourceOfBehaviour) {
		
	}
	
	def dispatch parseStatement(CollaborationStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot
//		if (robot.collaborations.collaborator != statement.collaboration)
	}
	
	
	def protected importResource(Resource resource, ResourceManager manager) {
		val Iterator<Import> iterator = resource.allContents.filter(typeof(Import))
		if (iterator.hasNext) {
			val Import imp = iterator.next
			if (!imp.importURI.empty) {
				if (!manager.importedModelPath.equals(imp.importURI)) {
					manager.load(imp)
				}
			}
		}
	}
}
