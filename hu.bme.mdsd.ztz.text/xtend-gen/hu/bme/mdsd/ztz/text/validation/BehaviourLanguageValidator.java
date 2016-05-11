/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import hu.bme.mdsd.ztz.text.manager.ResourceManager;
import hu.bme.mdsd.ztz.text.validation.AbstractBehaviourLanguageValidator;
import hu.bme.mdsd.ztz.text.validation.ErrorCodes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
      this.error("Import cannot be empty", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, 
        ErrorCodes.INVALID_IMPORT);
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
          BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, 
          ErrorCodes.INVALID_IMPORT);
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
        this.error("Robots cannot know themselves", BehaviourLanguagePackage.Literals.COLLABORATION_STATEMENT__ROBOT, 
          ErrorCodes.SAME_COLLABORATOR);
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
          this.error("Robots cannot have the same name", robot, DronePackage.Literals.NAMED_ELEMENT__NAME, 
            ErrorCodes.SAME_ROBOT_NAME);
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
            this.error("Messages cannot have the same name", message, DronePackage.Literals.NAMED_ELEMENT__NAME, 
              ErrorCodes.SAME_MESSAGE_NAME);
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
            this.error("Messages cannot have the same name", taskExecution, 
              DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_TASK_EXECUTION_NAME);
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
        this.error("Target robot is not in collaboration with the sender robot", target, 
          BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
      }
    } else {
      if ((target instanceof MultiTarget)) {
        EList<DynamicRobot> _target_1 = ((MultiTarget)target).getTarget();
        for (final DynamicRobot targetRobot : _target_1) {
          boolean _inCollaboration_1 = this.inCollaboration(collabStatements, robot, targetRobot);
          boolean _not_1 = (!_inCollaboration_1);
          if (_not_1) {
            this.error("Target robot is not in collaboration with the sender robot", target, 
              BehaviourLanguagePackage.Literals.MULTI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
          }
        }
      } else {
        if ((target instanceof AllTarget)) {
          boolean _hasCollaboration = this.hasCollaboration(collabStatements, robot);
          boolean _not_2 = (!_hasCollaboration);
          if (_not_2) {
            this.error("The sender robot is not in collaboration with anyone", target, 
              BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION);
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
  
  @Check
  public void checkSynchronousStatement(final SynchronousStatement synchronousStatement) {
    final HashMap<DynamicRobot, Integer> robotOccurrence = new HashMap<DynamicRobot, Integer>();
    EList<AtomicStatement> _statements = synchronousStatement.getStatements();
    for (final Statement statement : _statements) {
      {
        this.findRobotOccurrence(statement, robotOccurrence);
        Set<Map.Entry<DynamicRobot, Integer>> _entrySet = robotOccurrence.entrySet();
        for (final Map.Entry<DynamicRobot, Integer> entry : _entrySet) {
          Integer _value = entry.getValue();
          boolean _greaterThan = ((_value).intValue() > 1);
          if (_greaterThan) {
            this.error("A synchronous statement cannot contain more actions belonging to the same robot", 
              BehaviourLanguagePackage.Literals.SYNCHRONOUS_STATEMENT__STATEMENTS);
          }
        }
      }
    }
  }
  
  protected Integer _findRobotOccurrence(final ActionStatement statement, final HashMap<DynamicRobot, Integer> robotOccurence) {
    Integer _xblockexpression = null;
    {
      DynamicRobot _robot = statement.getRobot();
      int occurred = this.getOccurrence(robotOccurence, _robot);
      DynamicRobot _robot_1 = statement.getRobot();
      _xblockexpression = robotOccurence.put(_robot_1, Integer.valueOf(occurred));
    }
    return _xblockexpression;
  }
  
  protected Integer _findRobotOccurrence(final MessageStatement statement, final HashMap<DynamicRobot, Integer> robotOccurence) {
    Integer _xblockexpression = null;
    {
      DynamicRobot _robot = statement.getRobot();
      int occurred = this.getOccurrence(robotOccurence, _robot);
      DynamicRobot _robot_1 = statement.getRobot();
      _xblockexpression = robotOccurence.put(_robot_1, Integer.valueOf(occurred));
    }
    return _xblockexpression;
  }
  
  protected Integer _findRobotOccurrence(final DetectionStatement statement, final HashMap<DynamicRobot, Integer> robotOccurence) {
    Integer _xblockexpression = null;
    {
      DynamicRobot _robot = statement.getRobot();
      int occurred = this.getOccurrence(robotOccurence, _robot);
      DynamicRobot _robot_1 = statement.getRobot();
      _xblockexpression = robotOccurence.put(_robot_1, Integer.valueOf(occurred));
    }
    return _xblockexpression;
  }
  
  protected Integer _findRobotOccurrence(final Statement statement, final HashMap<DynamicRobot, Integer> robotOccurence) {
    return null;
  }
  
  public int getOccurrence(final HashMap<DynamicRobot, Integer> robotOccurence, final DynamicRobot robot) {
    int _xblockexpression = (int) 0;
    {
      int occurred = 0;
      int _xifexpression = (int) 0;
      boolean _containsKey = robotOccurence.containsKey(robot);
      if (_containsKey) {
        _xifexpression = occurred = 2;
      } else {
        _xifexpression = occurred = 1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkPropertyKeysForActionDeclarations(final ActionDeclarationStatement statement) {
    final HashMap<PropertyKey, String> keys = new HashMap<PropertyKey, String>();
    EList<PropertyKey> _properties = statement.getProperties();
    for (final PropertyKey key : _properties) {
      {
        boolean _containsKey = keys.containsKey(key);
        if (_containsKey) {
          this.error("An action cannot contain the same property twice", key, BehaviourLanguagePackage.Literals.ACTION_DECLARATION_STATEMENT__PROPERTIES);
          return;
        }
        keys.put(key, "");
      }
    }
  }
  
  @Check
  public void checkPropertyKeysForActionImplementation(final ActionImplementation actionImplementation) {
    EList<Property> _properties = actionImplementation.getProperties();
    int _size = _properties.size();
    ActionDeclarationStatement _declaration = actionImplementation.getDeclaration();
    EList<PropertyKey> _properties_1 = _declaration.getProperties();
    int _size_1 = _properties_1.size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      this.error("An action must have as many properties as its declaration has", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES);
    }
    final HashSet<PropertyKey> keys = new HashSet<PropertyKey>();
    EList<Property> _properties_2 = actionImplementation.getProperties();
    for (final Property property : _properties_2) {
      PropertyKey _key = property.getKey();
      keys.add(_key);
    }
    ActionDeclarationStatement _declaration_1 = actionImplementation.getDeclaration();
    EList<PropertyKey> _properties_3 = _declaration_1.getProperties();
    for (final PropertyKey key : _properties_3) {
      boolean _contains = keys.contains(key);
      boolean _not = (!_contains);
      if (_not) {
        this.error("An action must have the same properties as its declaration", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES);
      }
    }
  }
  
  @Check
  public void checkUniqueActionName(final ActionDeclarationStatement actionStatement) {
    EObject _eContainer = actionStatement.eContainer();
    final BehaviourLanguage container = ((BehaviourLanguage) _eContainer);
    EList<Statement> _statements = container.getStatements();
    for (final Statement otherStatement : _statements) {
      boolean _notEquals = (!Objects.equal(otherStatement, actionStatement));
      if (_notEquals) {
        if ((otherStatement instanceof ActionDeclarationStatement)) {
          String _name = ((ActionDeclarationStatement)otherStatement).getName();
          String _name_1 = actionStatement.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            this.error("Action declarations cannot have the same name", actionStatement, BehaviourLanguagePackage.Literals.ACTION_DECLARATION_STATEMENT__NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkActionWithoutDeclarations(final ActionImplementation action) {
    EObject _eContainer = action.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    final BehaviourLanguage container = ((BehaviourLanguage) _eContainer_1);
    EList<Statement> _statements = container.getStatements();
    Iterable<ActionDeclarationStatement> _filter = Iterables.<ActionDeclarationStatement>filter(_statements, ActionDeclarationStatement.class);
    int _size = IterableExtensions.size(_filter);
    boolean _equals = (_size == 0);
    if (_equals) {
      this.error("A robot cannot do an action without an action declaration. Declare an action with the action keyword.", action, 
        BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__DECLARATION);
    }
  }
  
  public Integer findRobotOccurrence(final Statement statement, final HashMap<DynamicRobot, Integer> robotOccurence) {
    if (statement instanceof ActionStatement) {
      return _findRobotOccurrence((ActionStatement)statement, robotOccurence);
    } else if (statement instanceof DetectionStatement) {
      return _findRobotOccurrence((DetectionStatement)statement, robotOccurence);
    } else if (statement instanceof MessageStatement) {
      return _findRobotOccurrence((MessageStatement)statement, robotOccurence);
    } else if (statement != null) {
      return _findRobotOccurrence(statement, robotOccurence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement, robotOccurence).toString());
    }
  }
}
