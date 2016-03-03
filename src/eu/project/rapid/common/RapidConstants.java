package eu.project.rapid.common;

public class RapidConstants {

  public static final int MAX_NUM_CLIENTS = 32;

  // Offloading decision related variables
  // public static final int LOCATION_NOT_DECIDED = -1;
  public static final int LOCATION_LOCAL = 1;
  public static final int LOCATION_REMOTE = 2;
  public static final int LOCATION_HYBRID = 3;
  public static final int LOCATION_DYNAMIC_TIME = 4;
  public static final int LOCATION_DYNAMIC_ENERGY = 5;
  public static final int LOCATION_DYNAMIC_TIME_ENERGY = 6;

  // TODO: check the real device name as returned by android for the HTC G1 phone
  public static final String PHONE_NAME_HTC_G1 = "HTC G1";
  public static final String PHONE_MODEL_HTC_DESIRE = "HTC Desire";
  public static final String PHONE_MODEL_SAMSUNG_GALAXY_S = "samsung GT-I9000";
  public static final String PHONE_MODEL_MOTOROLA_MOTO_G = "Motorola Moto G";

  public enum SETUP_TYPE {
    KVM, VIRTUALBOX, AMAZON, HYBRID
  }

  // The constants of the configuration files
  public static final String DEMO_SERVER_IP = "[DEMO SERVER IP]";
  public static final String DEMO_SERVER_PORT = "[DEMO SERVER PORT]";
  public static final String DS_IP = "[DS IP]";
  public static final String DS_PORT = "[DS PORT]";
  public static final String MANAGER_IP = "[MANAGER IP]";
  public static final String MANAGER_PORT = "[MANAGER PORT]";
  public static final String CLONE_TYPES = "[CLONE TYPES]"; // Type has to be one of: Local, Amazon,
                                                            // or Hybrid
  public static final String NR_CLONES_KVM_TO_START = "[NUMBER OF KVM CLONES TO START ON STARTUP]";
  public static final String NR_CLONES_VB_TO_START = "[NUMBER OF VB CLONES TO START ON STARTUP]";
  public static final String NR_CLONES_AMAZON_TO_START =
      "[NUMBER OF AMAZON CLONES TO START ON STARTUP]";
  public static final String KVM_CLONES = "[KVM CLONES]";
  public static final String VB_CLONES = "[VIRTUALBOX CLONES]";
  public static final String AMAZON_CLONES = "[AMAZON CLONES]";
  public static final String CLONE_PORT = "[CLONE PORT]";
  public static final String CLONE_SSL_PORT = "[CLONE SSL PORT]";
  public static final String CLONE_BW_TEST_PORT = "[CLONE BW TEST PORT]";
  public static final String CLONE_NAME = "[CLONE NAME]";
  public static final String CLONE_ID = "[CLONE ID]";

  public static final String MANAGER_CONFIG_FILE = "config-manager.cfg";
  public static final String DS_CONFIG_FILE = "config-ds.cfg";

}