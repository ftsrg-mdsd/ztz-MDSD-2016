/**
 */
package hu.bme.mdsd.ztz.model.drone.provider;

import hu.bme.mdsd.ztz.model.drone.util.DroneAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneItemProviderAdapterFactory extends DroneAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
        /**
         * This keeps track of the root adapter factory that delegates to this adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ComposedAdapterFactory parentAdapterFactory;

        /**
         * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected IChangeNotifier changeNotifier = new ChangeNotifier();

        /**
         * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected Collection<Object> supportedTypes = new ArrayList<Object>();

        /**
         * This constructs an instance.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneItemProviderAdapterFactory() {
                supportedTypes.add(IEditingDomainItemProvider.class);
                supportedTypes.add(IStructuredItemContentProvider.class);
                supportedTypes.add(ITreeItemContentProvider.class);
                supportedTypes.add(IItemLabelProvider.class);
                supportedTypes.add(IItemPropertySource.class);
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Mission} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MissionItemProvider missionItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Mission}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createMissionAdapter() {
                if (missionItemProvider == null) {
                        missionItemProvider = new MissionItemProvider(this);
                }

                return missionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Task} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskItemProvider taskItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Task}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createTaskAdapter() {
                if (taskItemProvider == null) {
                        taskItemProvider = new TaskItemProvider(this);
                }

                return taskItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskDescriptorItemProvider taskDescriptorItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createTaskDescriptorAdapter() {
                if (taskDescriptorItemProvider == null) {
                        taskDescriptorItemProvider = new TaskDescriptorItemProvider(this);
                }

                return taskDescriptorItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Position} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected PositionItemProvider positionItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Position}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createPositionAdapter() {
                if (positionItemProvider == null) {
                        positionItemProvider = new PositionItemProvider(this);
                }

                return positionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.AreaObject} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected AreaObjectItemProvider areaObjectItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.AreaObject}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createAreaObjectAdapter() {
                if (areaObjectItemProvider == null) {
                        areaObjectItemProvider = new AreaObjectItemProvider(this);
                }

                return areaObjectItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Coordinate} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CoordinateItemProvider coordinateItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Coordinate}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createCoordinateAdapter() {
                if (coordinateItemProvider == null) {
                        coordinateItemProvider = new CoordinateItemProvider(this);
                }

                return coordinateItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Property} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected PropertyItemProvider propertyItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Property}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createPropertyAdapter() {
                if (propertyItemProvider == null) {
                        propertyItemProvider = new PropertyItemProvider(this);
                }

                return propertyItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Robot} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotItemProvider robotItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Robot}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createRobotAdapter() {
                if (robotItemProvider == null) {
                        robotItemProvider = new RobotItemProvider(this);
                }

                return robotItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.StringProperty} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StringPropertyItemProvider stringPropertyItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.StringProperty}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createStringPropertyAdapter() {
                if (stringPropertyItemProvider == null) {
                        stringPropertyItemProvider = new StringPropertyItemProvider(this);
                }

                return stringPropertyItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.TaskRequirement} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskRequirementItemProvider taskRequirementItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.TaskRequirement}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createTaskRequirementAdapter() {
                if (taskRequirementItemProvider == null) {
                        taskRequirementItemProvider = new TaskRequirementItemProvider(this);
                }

                return taskRequirementItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Size} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SizeItemProvider sizeItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Size}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createSizeAdapter() {
                if (sizeItemProvider == null) {
                        sizeItemProvider = new SizeItemProvider(this);
                }

                return sizeItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Battery} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BatteryItemProvider batteryItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Battery}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createBatteryAdapter() {
                if (batteryItemProvider == null) {
                        batteryItemProvider = new BatteryItemProvider(this);
                }

                return batteryItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Equipment} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected EquipmentItemProvider equipmentItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Equipment}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createEquipmentAdapter() {
                if (equipmentItemProvider == null) {
                        equipmentItemProvider = new EquipmentItemProvider(this);
                }

                return equipmentItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.MeasureValue} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureValueItemProvider measureValueItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.MeasureValue}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createMeasureValueAdapter() {
                if (measureValueItemProvider == null) {
                        measureValueItemProvider = new MeasureValueItemProvider(this);
                }

                return measureValueItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.MeasureConversion} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureConversionItemProvider measureConversionItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.MeasureConversion}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createMeasureConversionAdapter() {
                if (measureConversionItemProvider == null) {
                        measureConversionItemProvider = new MeasureConversionItemProvider(this);
                }

                return measureConversionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.MeasureDimension} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureDimensionItemProvider measureDimensionItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.MeasureDimension}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createMeasureDimensionAdapter() {
                if (measureDimensionItemProvider == null) {
                        measureDimensionItemProvider = new MeasureDimensionItemProvider(this);
                }

                return measureDimensionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.MeasureProperty} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasurePropertyItemProvider measurePropertyItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.MeasureProperty}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createMeasurePropertyAdapter() {
                if (measurePropertyItemProvider == null) {
                        measurePropertyItemProvider = new MeasurePropertyItemProvider(this);
                }

                return measurePropertyItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotMissionContainerItemProvider robotMissionContainerItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createRobotMissionContainerAdapter() {
                if (robotMissionContainerItemProvider == null) {
                        robotMissionContainerItemProvider = new RobotMissionContainerItemProvider(this);
                }

                return robotMissionContainerItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.Capability} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CapabilityItemProvider capabilityItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.Capability}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createCapabilityAdapter() {
                if (capabilityItemProvider == null) {
                        capabilityItemProvider = new CapabilityItemProvider(this);
                }

                return capabilityItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CapabilityPropertiesItemProvider capabilityPropertiesItemProvider;

        /**
         * This creates an adapter for a {@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createCapabilityPropertiesAdapter() {
                if (capabilityPropertiesItemProvider == null) {
                        capabilityPropertiesItemProvider = new CapabilityPropertiesItemProvider(this);
                }

                return capabilityPropertiesItemProvider;
        }

        /**
         * This returns the root adapter factory that contains this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ComposeableAdapterFactory getRootAdapterFactory() {
                return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
        }

        /**
         * This sets the composed adapter factory that contains this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
                this.parentAdapterFactory = parentAdapterFactory;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object type) {
                return supportedTypes.contains(type) || super.isFactoryForType(type);
        }

        /**
         * This implementation substitutes the factory itself as the key for the adapter.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter adapt(Notifier notifier, Object type) {
                return super.adapt(notifier, this);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object adapt(Object object, Object type) {
                if (isFactoryForType(type)) {
                        Object adapter = super.adapt(object, type);
                        if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                                return adapter;
                        }
                }

                return null;
        }

        /**
         * This adds a listener.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void addListener(INotifyChangedListener notifyChangedListener) {
                changeNotifier.addListener(notifyChangedListener);
        }

        /**
         * This removes a listener.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void removeListener(INotifyChangedListener notifyChangedListener) {
                changeNotifier.removeListener(notifyChangedListener);
        }

        /**
         * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void fireNotifyChanged(Notification notification) {
                changeNotifier.fireNotifyChanged(notification);

                if (parentAdapterFactory != null) {
                        parentAdapterFactory.fireNotifyChanged(notification);
                }
        }

        /**
         * This disposes all of the item providers created by this factory. 
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void dispose() {
                if (missionItemProvider != null) missionItemProvider.dispose();
                if (taskItemProvider != null) taskItemProvider.dispose();
                if (taskDescriptorItemProvider != null) taskDescriptorItemProvider.dispose();
                if (positionItemProvider != null) positionItemProvider.dispose();
                if (areaObjectItemProvider != null) areaObjectItemProvider.dispose();
                if (coordinateItemProvider != null) coordinateItemProvider.dispose();
                if (propertyItemProvider != null) propertyItemProvider.dispose();
                if (robotItemProvider != null) robotItemProvider.dispose();
                if (stringPropertyItemProvider != null) stringPropertyItemProvider.dispose();
                if (taskRequirementItemProvider != null) taskRequirementItemProvider.dispose();
                if (sizeItemProvider != null) sizeItemProvider.dispose();
                if (batteryItemProvider != null) batteryItemProvider.dispose();
                if (equipmentItemProvider != null) equipmentItemProvider.dispose();
                if (measureValueItemProvider != null) measureValueItemProvider.dispose();
                if (measureConversionItemProvider != null) measureConversionItemProvider.dispose();
                if (measureDimensionItemProvider != null) measureDimensionItemProvider.dispose();
                if (measurePropertyItemProvider != null) measurePropertyItemProvider.dispose();
                if (robotMissionContainerItemProvider != null) robotMissionContainerItemProvider.dispose();
                if (capabilityItemProvider != null) capabilityItemProvider.dispose();
                if (capabilityPropertiesItemProvider != null) capabilityPropertiesItemProvider.dispose();
        }

}
