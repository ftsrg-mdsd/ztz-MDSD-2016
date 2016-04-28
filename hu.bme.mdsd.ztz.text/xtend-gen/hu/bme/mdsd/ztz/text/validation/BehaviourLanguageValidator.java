/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import hu.bme.mdsd.ztz.text.manager.ResourceManager;
import hu.bme.mdsd.ztz.text.validation.AbstractBehaviourLanguageValidator;
import hu.bme.mdsd.ztz.text.validation.ErrorCodes;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BehaviourLanguageValidator extends AbstractBehaviourLanguageValidator {
  @Check
  public Resource handleImport(final Import imp) {
    Resource _xifexpression = null;
    String _importURI = imp.getImportURI();
    boolean _isEmpty = _importURI.isEmpty();
    if (_isEmpty) {
      this.error("Import cannot be empty", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT);
    } else {
      Resource _xifexpression_1 = null;
      String _importURI_1 = imp.getImportURI();
      ResourceManager _instance = ResourceManager.getInstance();
      String _acceptedDomain = _instance.getAcceptedDomain();
      boolean _endsWith = _importURI_1.endsWith(_acceptedDomain);
      if (_endsWith) {
        Resource _xblockexpression = null;
        {
          final ResourceManager manager = ResourceManager.getInstance();
          Resource _xtrycatchfinallyexpression = null;
          try {
            _xtrycatchfinallyexpression = manager.load(imp);
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              String _message = e.getMessage();
              this.error(_message, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          _xblockexpression = _xtrycatchfinallyexpression;
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        ResourceManager _instance_1 = ResourceManager.getInstance();
        String _acceptedDomain_1 = _instance_1.getAcceptedDomain();
        String _plus = ("The resource must be an instance of " + _acceptedDomain_1);
        this.error(_plus, 
          BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkSelfKnowing(final CollaborationStatement statement) {
    EList<RobotCollaboration> _collaboration = statement.getCollaboration();
    for (final RobotCollaboration collab : _collaboration) {
      DynamicRobot _robot = statement.getRobot();
      DynamicRobot _collaborator = collab.getCollaborator();
      boolean _equals = Objects.equal(_robot, _collaborator);
      if (_equals) {
        this.error("Robots cannot know themselves", BehaviourLanguagePackage.Literals.COLLABORATION_STATEMENT__ROBOT, ErrorCodes.SAME_COLLABORATOR);
      }
    }
  }
  
  @Check
  public void checkUniqueRobotNames(final DynamicRobot robot) {
    EObject _eContainer = robot.eContainer();
    final BehaviourContainer container = ((BehaviourContainer) _eContainer);
    EList<DynamicRobot> _dynamicRobots = container.getDynamicRobots();
    for (final DynamicRobot otherRobot : _dynamicRobots) {
      boolean _notEquals = (!Objects.equal(otherRobot, robot));
      if (_notEquals) {
        String _name = otherRobot.getName();
        String _name_1 = robot.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          this.error("Robots cannot have the same name", robot, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_ROBOT_NAME);
        }
      }
    }
  }
  
  @Check
  public void checkUniqueMessageNames(final Message message) {
    Resource _eResource = message.eResource();
    TreeIterator<EObject> _allContents = _eResource.getAllContents();
    final Iterator<Message> messagesIterator = Iterators.<Message>filter(_allContents, Message.class);
    while (messagesIterator.hasNext()) {
      {
        Message otherMessage = messagesIterator.next();
        boolean _notEquals = (!Objects.equal(otherMessage, message));
        if (_notEquals) {
          String _name = otherMessage.getName();
          String _name_1 = message.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            this.error("Messages cannot have the same name", message, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_MESSAGE_NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniqueTaskExecutionNames(final TaskExecution taskExecution) {
    Resource _eResource = taskExecution.eResource();
    TreeIterator<EObject> _allContents = _eResource.getAllContents();
    final Iterator<TaskExecution> taskIterator = Iterators.<TaskExecution>filter(_allContents, TaskExecution.class);
    while (taskIterator.hasNext()) {
      {
        TaskExecution otherMessage = taskIterator.next();
        boolean _notEquals = (!Objects.equal(otherMessage, taskExecution));
        if (_notEquals) {
          String _name = otherMessage.getName();
          String _name_1 = taskExecution.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            this.error("Messages cannot have the same name", taskExecution, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_TASK_EXECUTION_NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniqueMessageStatement(final MessageStatement statement) {
    final DynamicRobot robot = statement.getRobot();
    Resource _eResource = statement.eResource();
    TreeIterator<EObject> _allContents = _eResource.getAllContents();
    final Iterator<CollaborationStatement> collabStatements = Iterators.<CollaborationStatement>filter(_allContents, CollaborationStatement.class);
    final MessageTarget target = statement.getTarget();
    if ((target instanceof UniTarget)) {
      DynamicRobot _target = ((UniTarget)target).getTarget();
      boolean _inCollaboration = this.inCollaboration(collabStatements, robot, _target);
      boolean _not = (!_inCollaboration);
      if (_not) {
        this.error("Target robot is not in collaboration with the sender robot", target, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
      }
    } else {
      if ((target instanceof MultiTarget)) {
        EList<DynamicRobot> _target_1 = ((MultiTarget)target).getTarget();
        for (final DynamicRobot targetRobot : _target_1) {
          boolean _inCollaboration_1 = this.inCollaboration(collabStatements, robot, targetRobot);
          boolean _not_1 = (!_inCollaboration_1);
          if (_not_1) {
            this.error("Target robot is not in collaboration with the sender robot", target, BehaviourLanguagePackage.Literals.MULTI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
          }
        }
      } else {
        if ((target instanceof AllTarget)) {
          boolean _hasCollaboration = this.hasCollaboration(collabStatements, robot);
          boolean _not_2 = (!_hasCollaboration);
          if (_not_2) {
            this.error("The sender robot is not in collaboration with anyone", target, BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
          }
        }
      }
    }
  }
  
  public boolean hasCollaboration(final Iterator<CollaborationStatement> collabStatements, final DynamicRobot robot) {
    while (collabStatements.hasNext()) {
      {
        CollaborationStatement stat = collabStatements.next();
        DynamicRobot _robot = stat.getRobot();
        boolean _equals = Objects.equal(_robot, robot);
        if (_equals) {
          return true;
        } else {
          EList<RobotCollaboration> _collaboration = stat.getCollaboration();
          for (final RobotCollaboration collab : _collaboration) {
            DynamicRobot _collaborator = collab.getCollaborator();
            boolean _equals_1 = Objects.equal(_collaborator, robot);
            if (_equals_1) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public boolean inCollaboration(final Iterator<CollaborationStatement> collabStatements, final DynamicRobot robot, final DynamicRobot targetRobot) {
    while (collabStatements.hasNext()) {
      {
        CollaborationStatement stat = collabStatements.next();
        DynamicRobot _robot = stat.getRobot();
        boolean _equals = Objects.equal(_robot, targetRobot);
        if (_equals) {
          return true;
        } else {
          DynamicRobot _robot_1 = stat.getRobot();
          boolean _equals_1 = Objects.equal(_robot_1, robot);
          if (_equals_1) {
            EList<RobotCollaboration> _collaboration = stat.getCollaboration();
            for (final RobotCollaboration collab : _collaboration) {
              DynamicRobot _collaborator = collab.getCollaborator();
              boolean _equals_2 = Objects.equal(_collaborator, targetRobot);
              if (_equals_2) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
}
